package com.zto.app25;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/emp")
public class EmpAction {
	
	
	/**
     * @ResponseBody Emp ��ʾ��springmvc��Emp����ת��json�ı�
	 */
	@RequestMapping(value="/bean2json")
	public @ResponseBody Emp bean2json() throws Exception{
		System.out.println("������������������������������������");
		//����Emp����
		Emp emp = new Emp();
		emp.setId(1);
		emp.setUsername("����");
		emp.setSalary(7000D);
		emp.setHiredate(new Date());
		return emp;
	}
	
	
	@RequestMapping(value="/listbean2json")
	public @ResponseBody List<Emp> listbean2json() throws Exception{
		//����List����
		List<Emp> empList = new ArrayList<Emp>();
		//��List�������������Emp����
		empList.add(new Emp(1,"����",7000D,new Date()));
		empList.add(new Emp(2,"�Ǻ�",8000D,new Date()));
		empList.add(new Emp(3,"����",9000D,new Date()));
		//������ҪתJSON�ı��Ķ���
		return empList;
	}

	
	@RequestMapping(value="/map2json")
	public @ResponseBody Map<String,Object> map2json() throws Exception{
		//����List����
		List<Emp> empList = new ArrayList<Emp>();
		//��List�������������Emp����
		empList.add(new Emp(1,"����",7000D,new Date()));
		empList.add(new Emp(2,"�Ǻ�",8000D,new Date()));
		empList.add(new Emp(3,"����",9000D,new Date()));
		//����Map����
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		//��Map�����а󶨶�������
		map.put("total",empList.size());
		map.put("rows",empList);
		//������ҪתJSON�ı��Ķ���
		return map;
	}
	
}






