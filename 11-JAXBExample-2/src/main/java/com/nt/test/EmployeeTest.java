package com.nt.test;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;

import com.nt.modle.Address;
import com.nt.modle.Course;
import com.nt.modle.Employee;
import com.nt.modle.Student;

public class EmployeeTest {
	/*
	 * public static void main(String[] args) { try {
	 * 
	 * JAXBContext context = JAXBContext.newInstance(Employee.class); Unmarshaller
	 * um = context.createUnmarshaller(); Employee emp = (Employee)um.unmarshal(new
	 * File("E://data.xml"));
	 * 
	 * System.out.println(emp); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } }
	 */
	public static void main(String[] args) {
		try {
			
			Employee emp = new Employee();
			emp.setEmpId(101);
			emp.setEmpName("Shams");
			emp.setEmpSal(500.5);
			emp.setEmpwd("shamsh@123");
			
			Set<String> proj = new HashSet<String>();
			proj.add("Naresh I Technology");
			proj.add("Java");
			proj.add("Oracle");
			
            emp.setEmpProj(proj);
            System.out.println("Project");
            
        //  Map<String,String> clients = new HashMap<>();
            Map<String,String> clients = new LinkedHashMap<>();
            clients.put("c3", "HORRKY");
            clients.put("c2", "MEGA-CROP");
            clients.put("c1", "ACT-ROM");
            
            emp.setClients(clients);
            System.out.println("Clients");
            
            Address addr = new Address();
			addr.setHome_no("9-99/A-5");
			addr.setLocation("HYD");
			
			emp.setAddr(addr);
			System.out.println("Address");
            
			Set<String> subjects= new HashSet<>();
			subjects.add("Physics");
			subjects.add("Chemistry");
			subjects.add("Math");
			
			emp.setSubjects(subjects);
	        System.out.println("Subjects");
			
			
			Map<String,Integer> marks= new LinkedHashMap<>();
			marks.put("Java", 40);
			marks.put("Oracle", 45);
			marks.put("Spring", 55);
	            
	        emp.setMarks(marks);
	        System.out.println("Marks");
	        
	        Student st = new Student();
	        st.setSid(1019);
	        st.setSname("Shamshad");
	       
	        emp.setStudent(st);
	        System.out.println(st);
	        
			Course course = new Course();  
			course.setCid(2015);
			course.setCname("Full Stack Developer");
			course.setSfee(103.9f);
			emp.setCourse(course);
			System.out.println(course);
			
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller m = context.createMarshaller();
			m.marshal(emp, new File("data.xml"));
			System.out.println("Done By Shamshad");
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
	}
}