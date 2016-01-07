package com.zto.app19;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	 * �Զ�������ת����
	 */
	@InitBinder
	public void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(
				Date.class, 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),true));
	}
	/**
	 * �û�ע�ᣬֻ�ܽ���POST����
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerMethod(User user,Model model) throws Exception{
		System.out.println("�û�ע��:" + user.toString());
		//��user�󶨵�model������
		model.addAttribute("user",user);
		//ת����success.jspҳ��
		return "/jsp/success.jsp";
	}
}




