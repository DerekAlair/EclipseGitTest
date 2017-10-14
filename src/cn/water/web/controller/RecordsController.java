package cn.water.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.result.RecordAndOrder;
import cn.water.result.SalesResult;
import cn.water.service.impl.RecordService;
import cn.water.utils.PageBean;
import cn.water.vo.QuerySales;
import cn.water.vo.QueryVo;

@Controller
@RequestMapping("/records")
public class RecordsController {

	@Autowired
	private RecordService recordService;
	
	/**
	 * 当条件不为空是根据条件查询送水记录，若为空则查询所有送水记录(送水员姓名)
	 * @param vo
	 * @param model
	 * @return
	 */
	@RequestMapping("/waterRecords")
	public String waterRecords(QueryVo vo,Model model){
		//判断当前页是否为空
		if(vo.getPage()==null){
			vo.setPage(1);
		}
		
		//设置起始页
		vo.setStart((vo.getPage()-1)*vo.getSize());
		//查询数据
		List<RecordAndOrder> rList = recordService.waterRecords(vo);
		Integer totalCount = recordService.getCount(vo);
		
		//封装数据
		PageBean<RecordAndOrder> pb = new PageBean<RecordAndOrder>();
		pb.setCurrPage(vo.getPage());
		pb.setPageSize(vo.getSize());
		pb.setRows(rList);
		pb.setTotalCount(totalCount);
		
		model.addAttribute("pb", pb);
		return "";
	}
	
	/**
	 * 若条件不为空，根据条件查询销售金额(条件:区域，价格)
	 * @param qs
	 * @param model
	 * @return
	 */
	@RequestMapping("/sales")
	public String salesRecord(QuerySales qs,Model model){
		//判断是否为空
		if(qs.getPage()==null){
			qs.setPage(1);
		}
		
		//设置起始页
		qs.setStart((qs.getPage()-1)*qs.getSize());
		
		//查询数据
		List<SalesResult> qsList = recordService.salesRecord(qs);
		Integer totalCount = recordService.getCountqs(qs);
		
		//封装数据
		PageBean<SalesResult> pb = new PageBean<SalesResult>();
		pb.setCurrPage(qs.getPage());
		pb.setPageSize(qs.getSize());
		pb.setRows(qsList);
		pb.setTotalCount(totalCount);
		
		//传输数据到前台
		model.addAttribute("pb", pb);
		
		return "";
	}
}
