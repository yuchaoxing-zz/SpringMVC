package com.zto.app22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/emp")
public class EmpAction {
	@RequestMapping(value="/deleteAll",method=RequestMethod.POST)
	public String deleteAll(Model model,int[] ids) throws Exception{
		System.out.println("��Ҫɾ����Ա����ŷֱ��ǣ�");
		for(int id : ids){
			System.out.print(id+" ");
		}
		
		model.addAttribute("message","����ɾ��Ա���ɹ�");
		return "/jsp/success.jsp";
	}
}
