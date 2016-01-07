package com.zto.app13;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * SpringMVC���Ʋ�
 * @author ���
 *
 */
public class PersonAction implements Controller{

	public PersonAction(){
		System.out.println("PersonAction()"+"���췽��");
	}
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("������"+this.hashCode());
		ModelAndView modelAndView = new ModelAndView();
		
		List<Person> list=new PersonDAO().findAll();
		
		modelAndView.addObject("message",list); 
		
		modelAndView.setViewName("/index.jsp");
		
		return modelAndView;
	}

	
	

}
