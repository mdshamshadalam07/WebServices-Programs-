package com.nt.raghu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/sample")
public class SampleRestController {
	
	@GET
	public String showA(){
		return "A";
	}
	
	@POST
	@Path("/b")
	public String showB(){
		return "B";
	}
	
	

}
