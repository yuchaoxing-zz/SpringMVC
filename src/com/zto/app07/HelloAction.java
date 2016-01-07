package com.zto.app07;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * SpringMVC控制器
 * @author 邢宇超
 *
 */

public class HelloAction implements Controller{

	/**
	 * 业务方法
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "视图解析器");
		
		//这个是添加真实路径
		//modelAndView.setViewName("/jsp/success.jsp");
		
		//这个是添加逻辑路径
		modelAndView.setViewName("success");
		
		return modelAndView;
	}

}
