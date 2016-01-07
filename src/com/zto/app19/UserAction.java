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
 *  控制器
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/user")
public class UserAction {
	/**
	 * 自定义类型转换器
	 */
	@InitBinder
	public void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(
				Date.class, 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),true));
	}
	/**
	 * 用户注册，只能接收POST请求
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public String registerMethod(User user,Model model) throws Exception{
		System.out.println("用户注册:" + user.toString());
		//将user绑定到model对象中
		model.addAttribute("user",user);
		//转发到success.jsp页面
		return "/jsp/success.jsp";
	}
}




