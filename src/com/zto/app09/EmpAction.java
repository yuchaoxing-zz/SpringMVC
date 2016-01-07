package com.zto.app09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * ��������ʵ��Controller����
 * @author ���
 */
public class EmpAction implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView();
		//���ñ��뷽ʽ
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		//��ȡ�û���
		String name=new String((request.getParameter("username")).getBytes("iso-8859-1"),"utf-8");
		System.out.println("Ա������:"+name);
		
		//��Ա��������װ��modelAndView��
		modelAndView.addObject("message", name);
		
		//ʹ����ʵ�߼���ͼ��ת��
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

}
