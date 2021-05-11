package com.nt.raghu;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			
	        
	        Address addr = new Address();
			addr.setHome_no("Shamshad-786");
			addr.setLocation("Arwal");
			
			Employee emp = new Employee();
			emp.setEid(10);
			emp.setEname("king");
			emp.setAob(addr);
			
			
	
			ObjectMapper om = new ObjectMapper();
			
			String json = om.writeValueAsString(emp);
			System.out.println(json);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}   