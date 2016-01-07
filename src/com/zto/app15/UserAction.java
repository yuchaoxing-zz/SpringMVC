package com.zto.app15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserAction {

	/**
	 * �û�ע��
	 */
	@RequestMapping(value="/register")
	public String registerMethod(Model model) throws Exception{
		model.addAttribute("message","Ա��ע��ɹ�");
		return "/jsp/success.jsp";
	}
	/**
	 * �û���¼
	 */
	@RequestMapping(value="/login")
	public String loginMethod(Model model) throws Exception{
		model.addAttribute("message","Ա����¼�ɹ�");
		return "/jsp/success.jsp";
	}
}
