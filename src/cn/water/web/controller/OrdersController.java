package cn.water.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.service.impl.OrderService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * 加载出所有的品牌(由于下拉框)
	 * @return
	 */
//	@RequestMapping("/brand")
//	public String Brand(){
//		List<String> brand = orderService.Brand();
//		return "";
//	}

}
