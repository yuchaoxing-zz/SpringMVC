package com.zto.app05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * SpringMVC控制器
 * @author 邢宇超
 */
public class HelloAction implements Controller{

	public HelloAction(){
		System.out.println("HelloAction::"+"构造方法");
	}
	/**
	 * 业务方法
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("handleRequest():::"+this.hashCode());
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "第一个SpringMVC应用");
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

	
}
