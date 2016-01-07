package com.zto.app05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * SpringMVC控制器
 * @author 邢宇超
 */
public class ByeAction implements Controller {

	public ByeAction(){
		System.out.println("ByeAction"+"构造方法");
	}
	
	/**
	 * 业务方法
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("handleRequest()::"+this.hashCode());
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "第二个SpringMVC应用程序");
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

}
