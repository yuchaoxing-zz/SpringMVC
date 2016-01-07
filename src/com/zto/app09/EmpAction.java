package com.zto.app09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * 控制器是实现Controller的类
 * @author 邢宇超
 */
public class EmpAction implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView();
		//设置编码方式
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		//获取用户名
		String name=new String((request.getParameter("username")).getBytes("iso-8859-1"),"utf-8");
		System.out.println("员工姓名:"+name);
		
		//将员工姓名封装到modelAndView中
		modelAndView.addObject("message", name);
		
		//使用真实逻辑视图跳转、
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

}
