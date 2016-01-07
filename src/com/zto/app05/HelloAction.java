package com.zto.app05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * SpringMVC������
 * @author ���
 */
public class HelloAction implements Controller{

	public HelloAction(){
		System.out.println("HelloAction::"+"���췽��");
	}
	/**
	 * ҵ�񷽷�
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("handleRequest():::"+this.hashCode());
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "��һ��SpringMVCӦ��");
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

	
}
