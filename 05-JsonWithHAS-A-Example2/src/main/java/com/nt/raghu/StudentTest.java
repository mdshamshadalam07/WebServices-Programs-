package com.nt.raghu;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentTest {
	public static void main(String[] args) {
		try {
			
	        
	        ExamResult es = new ExamResult();
			es.setResult("First");
			es.setTotalMarks(350);
			es.setGrade("A");
			
			Student st = new Student();
			st.setSid(07);
			st.setSname("Shamshad");
			st.setSfee(1250);
			st.setEs(es);
			
			ObjectMapper om = new ObjectMapper();
			
			String json = om.writeValueAsString(st);
			System.out.println(json);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}   