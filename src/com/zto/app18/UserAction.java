package com.zto.app18;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  ������
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/user")
public class UserAction {
	/**
	 * �û�ע�ᣬֻ�ܽ���POST����
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerMethod(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		//��ȡ�û�����нˮ
		String username = request.getParameter("username");
		String salary = request.getParameter("salary");
		System.out.println("�û�ע��-->" + username + ":" + salary);
		
		//�󶨵�session�������
		request.getSession().setAttribute("username",username);
		request.getSession().setAttribute("salary",salary);
		
		//�ض���/jsp/success.jspҳ��
		//response.sendRedirect(request.getContextPath()+"/jsp/success.jsp");
		
		//ת��/jsp/ok.jspҳ��
		//request.getRequestDispatcher("/jsp/ok.jsp").forward(request,response);
		
		//ת��(�ᳫ)
		return "/jsp/success.jsp";
	}
}




