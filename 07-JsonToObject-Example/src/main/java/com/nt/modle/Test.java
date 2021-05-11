package com.nt.modle;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		
		try {
			
	//		String json="{\"eid\":10,\"ename\":\"Shams\",\"esal\":200.0}"; 
	//		String json="{\"eid\":10,\"ename\":\"Shams\"}";
	//		String json="{\"eid\":10}";
	//	    String json="{ }";  // valid json 
			
			 ObjectMapper om = new ObjectMapper();
		//	 Employee emp = om.readValue(json, Employee.clas
			 Employee emp = om.readValue(new File("E:\\web\\emps.json"),Employee.class);
			
			System.out.println(emp);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
