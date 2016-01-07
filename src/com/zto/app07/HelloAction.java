package com.zto.app07;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * SpringMVC������
 * @author ���
 *
 */

public class HelloAction implements Controller{

	/**
	 * ҵ�񷽷�
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "��ͼ������");
		
		//����������ʵ·��
		//modelAndView.setViewName("/jsp/success.jsp");
		
		//���������߼�·��
		modelAndView.setViewName("success");
		
		return modelAndView;
	}

}
