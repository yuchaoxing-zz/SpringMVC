package com.zto.app24;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/emp")				
public class EmpAction {
	
	@RequestMapping(value="/find")
	public String findEmpById(int id,Model model) throws Exception{
		System.out.println("��ѯ"+id+"��Ա����Ϣ");
		
		//ת����EmpAction����һ��������ȥ�����ٴη�������
		return "forward:/emp/update.action";
		
		//�ض���EmpAction����һ��������ȥ�����ٴη�������
		//return "redirect:/emp/update.action?id=" + id;

	}

	@RequestMapping(value="/update")
	public String updateEmpById(int id,Model model) throws Exception{
		System.out.println("����" + id +"��Ա����Ϣ");
		model.addAttribute("message","����Ա����Ϣ�ɹ�");
		return "/jsp/ok.jsp";
	}
	
}




