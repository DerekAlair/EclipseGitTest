package cn.water.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.pojo.Sailors;
import cn.water.service.impl.SailorService;

@Controller
@RequestMapping("/sailors")
public class SailorsController {

	@Autowired
	private SailorService sailorService;
	
	/**
	 * 完善个人信息
	 * @param sailors
	 * @return
	 */
	@RequestMapping("/save")
	public String saveSailor(Sailors sailors){
		sailorService.saveSailor(sailors);
		return "";
	}
	
	/**
	 * 修改个人信息
	 * @param sailors
	 * @return
	 */
	@RequestMapping("/update")
	public String updateSailor(Sailors sailors){
		sailorService.updateSailor(sailors);
		return "";
	}
	
	/**
	 * 查询个人信息
	 * @param sailors
	 * @return
	 */
	@RequestMapping("/select")
	public String selectSailor(Sailors sailors){
		return "";
	}
}
