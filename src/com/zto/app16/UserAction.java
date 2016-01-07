package com.zto.app16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserAction {

	/**
	 * �û�ע�ᣬֻ�ܽ���POST����
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerMethod(Model model,String username,String salary) throws Exception{
		System.out.println("�û�ע��-->" + username + ":" + salary);
		model.addAttribute("message","Ա��ע��ɹ�");
		return "/jsp/success.jsp";
	}
	/**
	 * �û���¼�����ܽ���POST�������ܽ���GET����
	 */
	@RequestMapping(value="/login")
	public String loginMethod(Model model,String username) throws Exception{
		
		System.out.println("�û���¼-->" + username);
		model.addAttribute("message","Ա����¼�ɹ�");
		return "/jsp/success.jsp";
	}
}
