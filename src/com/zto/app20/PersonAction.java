package com.zto.app20;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/person")
public class PersonAction {
	@InitBinder
	public void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(
				Date.class, 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
	}
	
	
	
	
	
	/**
	 * ҵ�񷽷�
	 */	
	@RequestMapping(value="/register")
	public String registerMethod(Bean bean,Model model) throws Exception{
		System.out.println("��ͨ�û���" + bean.getUser());
		System.out.println("����Ա��" + bean.getAdmin());
		//��user��admin���󶨵�Model
		model.addAttribute("user",bean.getUser());
		model.addAttribute("admin",bean.getAdmin());
		//ת��
		return "/jsp/ok2.jsp";
	}
}













