package com.nt.raghu.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Employee;


public class EmployeeTest {
	public static void main(String[] args) {
		try {
			Employee emp = new Employee();
			emp.setEmpId(10);
			emp.setEmpName("king");
			emp.setEmpSal(1000);
			
	
			ObjectMapper om = new ObjectMapper();
			
			String jackson = om.writeValueAsString(emp);
			System.out.println(jackson);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}