package com.zto.app08;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * SpringMVC������
 * @author ���
 */
public class UserAction implements Controller {

	public UserAction(){
		System.out.println("UserAction()"+this.hashCode());
	}
	/**
	 * ҵ�񷽷�
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ӳ��������...");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "ӳ�������Գɹ���");
		
		//ʹ���߼���ͼ����
		modelAndView.setViewName("success");
		
		return modelAndView;
	}

}
