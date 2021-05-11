package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private Integer empId;
	private String empName;
	private float empSal;

	private List<String> eprojs;
	private Set<String> modules;
	
	private Map<String,Integer> projver;
	private Address addr; 

	public Employee() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public List<String> getEprojs() {
		return eprojs;
	}

	public void setEprojs(List<String> eprojs) {
		this.eprojs = eprojs;
	}

	public Set<String> getModules() {
		return modules;
	}

	public void setModules(Set<String> modules) {
		this.modules = modules;
	}

	public Map<String, Integer> getProjver() {
		return projver;
	}

	public void setProjver(Map<String, Integer> projver) {
		this.projver = projver;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
      
  
}
