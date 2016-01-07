package com.zto.app16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserAction {

	/**
	 * 用户注册，只能接收POST请求
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerMethod(Model model,String username,String salary) throws Exception{
		System.out.println("用户注册-->" + username + ":" + salary);
		model.addAttribute("message","员工注册成功");
		return "/jsp/success.jsp";
	}
	/**
	 * 用户登录，即能接收POST请求，又能接收GET请求
	 */
	@RequestMapping(value="/login")
	public String loginMethod(Model model,String username) throws Exception{
		
		System.out.println("用户登录-->" + username);
		model.addAttribute("message","员工登录成功");
		return "/jsp/success.jsp";
	}
}
