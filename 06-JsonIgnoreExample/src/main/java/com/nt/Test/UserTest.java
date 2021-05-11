package com.nt.Test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.User;

public class UserTest {
	public static void main(String[] args) {
		try {
			
			User ur= new User();
			ur.setUid(50);  
			ur.setUname("kamar");
			ur.setUpassword("King@1278");
			ur.setUrole("Doctor");
			
            ObjectMapper om = new ObjectMapper();	
			//String json = om.writeValueAsString(ur);
			//System.out.println(json);
            
            om.writeValue(new File ("E:/web/users.json"),ur);
            System.out.println("Done");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
