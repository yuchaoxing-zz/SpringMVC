package com.zto.app11;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;


@SuppressWarnings("deprecation")
public class EmpAction extends AbstractCommandController{

	public EmpAction(){
		//将表单参数封装到Emp对象中去
		this.setCommandClass(Emp.class);
	}
	/**
	 * 自定义类型转换器，将String->Date类型(格式yyyy-MM-dd)
	 */
	@Override
	protected void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		//向springmvc内部注入一个自定义的类型转换器
		//参数一：将String转成什么类型的字节码
		//参数二：自定义转换规则
		//true表示该日期字段可以为空
		binder.registerCustomEditor(
				Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object obj, BindException error)
			throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","增加员工成功");
		
		Emp emp = (Emp) obj;
		//System.out.println(emp.getName()+":"+emp.getGender()+":"+emp.getHiredate().toLocaleString());
		
		//将Emp封装到ModeAndView对象中
		modelAndView.addObject("emp",emp);
		
		modelAndView.setViewName("/jsp/ok.jsp");
		
		return modelAndView;
	}

	





}
