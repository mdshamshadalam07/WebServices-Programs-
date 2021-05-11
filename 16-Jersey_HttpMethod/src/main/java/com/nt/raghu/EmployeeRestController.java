package com.nt.raghu;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp")

public class EmployeeRestController {

	@POST
	@Path("/create")
	public String saveEmployee() {
		return "EMP SAVE";
	}
	
	@PUT
	@Path("/modify")
	public String updateEmployee() {
		return "EMP UPDATE";
	}
	
	@GET
	@Path("/fetch")
	public String getOneEmployee() {
		return "EMP GET";
	}
	
	@DELETE
//	@Path("/remove")
	public String remvoeOneEmployee() {
		return "EMP REMOVE";
	}	
}