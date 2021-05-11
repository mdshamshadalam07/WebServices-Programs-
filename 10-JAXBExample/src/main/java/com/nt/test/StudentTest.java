package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.nt.modle.Student;

public class StudentTest {
	public static void main(String[] args) {
		try {
			
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller um = context.createUnmarshaller();
			Student std = (Student)um.unmarshal(new File("E://data.xml"));
			
		    System.out.println(std);	
		 } 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try {
			
			Student s1 = new Student();
			s1.setStdId(101);
			s1.setStdName("Rama");
			s1.setStdFee(500.5);
			
			JAXBContext context = JAXBContext.newInstance(Student.class);
			
			Marshaller m = context.createMarshaller();
			System.out.println(m.getClass().getName());
			m.marshal(s1, new File("E://data.xml"));
			System.out.println("done");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
