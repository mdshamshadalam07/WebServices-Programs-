package com.nt.raghu.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student st = new Student();
			st.setStdId(07);
			st.setStdName("Shamshad");
			st.setStdFee(50000);
			
			ObjectMapper om = new ObjectMapper();
			
			String jackson = om.writeValueAsString(st);
			System.out.println(jackson);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}