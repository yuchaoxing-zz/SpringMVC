package com.zto.app14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAction {

	public HelloAction(){
		System.out.println("HelloAction()::" + this.hashCode());
	}
	
	
	/**
	 * ҵ�񷽷�
	 * ֻҪ��/hello.action�����󣬶�����HelloAction�����е�hello()����ȥ����
	 */
	@RequestMapping(value="/hello.action")   
	public String hello(Model model) throws Exception{
		System.out.println("HelloAction::hello()");
		model.addAttribute("message","���");
		return "success";
	}
	
	/**
	 * ҵ�񷽷�
	 * ֻҪ��/bye.action�����󣬶�����HelloAction�����е�bye()����ȥ����
	 */
	@RequestMapping(value="/bye.action")   
	public String bye(Model model) throws Exception{
		System.out.println("HelloAction::hello()");
		model.addAttribute("message","�ټ�");
		return "success";
	}
}
