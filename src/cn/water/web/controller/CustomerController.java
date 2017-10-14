package cn.water.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.pojo.Customer;
import cn.water.service.impl.CustomerService;
import cn.water.utils.PageBean;
import cn.water.vo.QueryVo;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	/**
	 * 添加客户
	 * @return
	 */
	@RequestMapping("/saveCustomer")
	public String saveCustomer(Customer customer){
		customerService.saveCustomer(customer);
		return "";
	}
	
	/**
	 * 更新客户信息
	 * @param customer
	 * @return
	 */
	@RequestMapping("/updateCustomer")
	public String updateCustomer(Customer customer){
		customerService.updateCustomer(customer);
		return "";
	}
	
	/**
	 * 删除客户
	 * @param customer
	 * @return
	 */
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(Customer customer){
		customerService.deleteCustomer(customer.getCid());
		return "";
	}
	
	/**
	 * 如条件为空,则查询所有客户(条件:客户姓名)
	 * @param vo
	 * @return
	 */
	public String selectAllCustomer(QueryVo vo,Model model){
		if(vo.getPage()==null){
			vo.setPage(1);
		}
		
		//设置起始条
		vo.setStart((vo.getPage()-1)*vo.getSize());
		
		//查询数据
		List<Customer> cList = customerService.selectAllCustomer(vo);
		Integer totalCount = customerService.getCount(vo);
		
		//封装数据
		PageBean<Customer> pb = new PageBean<Customer>();
		pb.setCurrPage(vo.getPage());
		pb.setPageSize(vo.getSize());
		pb.setRows(cList);
		pb.setTotalCount(totalCount);
		
		model.addAttribute("pb", pb);
		return "";
	}
}
