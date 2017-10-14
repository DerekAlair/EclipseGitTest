package cn.water.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.pojo.Product;
import cn.water.service.impl.ProductService;
import cn.water.utils.PageBean;
import cn.water.vo.QueryVo;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/**
	 * 加载出所有的品牌(用于下拉框)
	 * @return
	 */
	@RequestMapping("/brand")
	public String brands(){
		List<String> bList = productService.brands();
		return "";
	}
	
	/**
	 * 加载出所有的价格(用于下拉框)
	 * @return
	 */
	@RequestMapping("/prices")
	public String prices(){
		List<Double> pList = productService.prices();
		return "";
	}
	
	/**
	 * 添加商品
	 * @param product
	 * @return
	 */
	@RequestMapping("/saveProduct")
	public String saveProduct(Product product){
		productService.saveProduct(product);
		return "";
	}
	
	/**
	 * 修改商品
	 * @param product
	 * @return
	 */
	@RequestMapping("/updateProduct")
	public String updateProduct(Product product){
		productService.updateProduct(product);
		return "";
	}
	
	/**
	 * 删除商品
	 * @param product
	 * @return
	 */
	@RequestMapping("/deleteProduct")
	public String deleteProduct(Product product){
		productService.deleteProduct(product.getPid());
		return "";
	}
	
	/**
	 * 查询出所有的商品
	 * @return
	 */
	@RequestMapping("/selectAll")
	public String selectAllProduct(QueryVo vo,Model model){
		if(vo.getPage()==null){
			vo.setPage(1);
		}
		
		//设置起始条
		vo.setStart((vo.getPage()-1)*vo.getSize());
		
		//查询数据
		List<Product> pList = productService.selectAllProduct(vo);
		Integer totalCount = productService.getCount(vo);
		
		//封装数据
		PageBean<Product> pb = new PageBean<Product>();
		pb.setCurrPage(vo.getPage());
		pb.setPageSize(vo.getSize());
		pb.setRows(pList);
		pb.setTotalCount(totalCount);
		
		model.addAttribute("pb", pb);
		return "";
	}
}
