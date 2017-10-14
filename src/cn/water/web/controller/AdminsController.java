package cn.water.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.water.pojo.Admins;
import cn.water.service.impl.AdminService;

@Controller
@RequestMapping("/admins")
public class AdminsController {
	
	@Autowired
	private AdminService adminService;
	
	/**
	 * 登录
	 * @param admins
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Admins admins, HttpSession session){
		Admins oAdmins = adminService.login(admins.getAdminname(),admins.getPassword());
		if(oAdmins!=null){
			session.setAttribute("existOadmins", oAdmins);
			return "";//跳到主页面
		}
		return "";//跳回登录页面
	}
	
	/**
	 * 注册
	 * @param admins
	 * @return
	 */
	@RequestMapping("/register")
	public String register(Admins admins){
		adminService.save(admins);
		return "";//注册成功之后跳到完善个人信息页面
	}
	
	/**
	 * 删除账号(管理员才有权限删除)
	 * @param admins
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Admins admins){
		adminService.delete(admins.getAdminid());
		return "";
	}
	
	/**
	 * 更改权限(管理员才有权限更改)
	 * @param admins
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Admins admins){
		adminService.update(admins);
		return "";
	}
	
	/**
	 * 退出登录
	 * @param admins
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		Admins admins = (Admins) session.getAttribute("existOadmins");
		if(admins!=null){
			session.removeAttribute("existOadmins");
		}
		return "";//跳到登录页面
	}
}
