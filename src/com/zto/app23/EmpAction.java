package com.zto.app23;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 员工模块
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/emp")
public class EmpAction {
	/**
	 * 批量添加员工
	 */
	@RequestMapping(value="/addAll",method=RequestMethod.POST)
	public String addAll(Model model,Bean bean) throws Exception{
		for(Emp emp:bean.getEmpList()){
			System.out.println(emp.getUsername()+":"+emp.getSalary());
		}
		model.addAttribute("message","批量增加员工成功");
		return "/jsp/success.jsp";
	}
}





