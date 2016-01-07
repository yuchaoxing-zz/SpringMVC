package com.zto.app15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserAction {

	/**
	 * 用户注册
	 */
	@RequestMapping(value="/register")
	public String registerMethod(Model model) throws Exception{
		model.addAttribute("message","员工注册成功");
		return "/jsp/success.jsp";
	}
	/**
	 * 用户登录
	 */
	@RequestMapping(value="/login")
	public String loginMethod(Model model) throws Exception{
		model.addAttribute("message","员工登录成功");
		return "/jsp/success.jsp";
	}
}
