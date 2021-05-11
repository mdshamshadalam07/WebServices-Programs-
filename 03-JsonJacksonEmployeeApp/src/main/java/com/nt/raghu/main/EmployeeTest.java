package com.nt.raghu.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Address;
import com.nt.model.Employee;


public class EmployeeTest {
	public static void main(String[] args) {
		try {
			List <String> list = new ArrayList<>(); 
			list.add("P1");
			list.add("P2");
			list.add("P3");
			
			Set<String> set = new HashSet<>();
			set.add("M1");
			set.add("M2");
			set.add("M3");
			
			Map<String ,Integer> map = new HashMap<>();
	        map.put("V1", 10);
	        map.put("V2", 15);
	        map.put("V3", 20);
	        
	        Address addr = new Address();
			addr.setHome_no("Babu-786");
			addr.setLocation("Walidad");
			
			Employee emp = new Employee();
			emp.setEmpId(10);
			emp.setEmpName("king");
			emp.setEmpSal(1000);
			emp.setEprojs(list);
			emp.setModules(set);
			emp.setProjver(map);
			emp.setAddr(addr); 
			
	
			ObjectMapper om = new ObjectMapper();
			
			String jackson = om.writeValueAsString(emp);
			System.out.println(jackson);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}   