package com.nt.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Set;


public class TestTwo {
	public static void main(String[] args) {
		
    //  Map<String,String> clients = new HashMap<>();
        Map<String,String> clients = new LinkedHashMap<>();
        clients.put("c3", "HORRKY");
        clients.put("c2", "MEGA-CROP");
        clients.put("c1", "ACT-ROM");
          
        Set<Map.Entry<String,String>> entries = clients.entrySet();
        Iterator<Map.Entry<String,String>> itr = entries.iterator();
        while(itr.hasNext()) {
        	Map.Entry<String, String> entry = itr.next();
        	System.out.println(entry.getKey() + "-" + entry.getValue());
        }
	}

}
