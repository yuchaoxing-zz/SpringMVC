package com.zto.app23;

import java.util.ArrayList;
import java.util.List;

/**
 * ��װ���Emp�Ķ��� 
 * @author AdminTC
 */
public class Bean {
	private List<Emp> empList = new ArrayList<Emp>();
	public Bean(){}
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
}
