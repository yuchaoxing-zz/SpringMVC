package com.zto.app08;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * SpringMVC控制器
 * @author 邢宇超
 */
public class UserAction implements Controller {

	public UserAction(){
		System.out.println("UserAction()"+this.hashCode());
	}
	/**
	 * 业务方法
	 */
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("映射器测试...");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "映射器测试成功！");
		
		//使用逻辑视图名称
		modelAndView.setViewName("success");
		
		return modelAndView;
	}

}
