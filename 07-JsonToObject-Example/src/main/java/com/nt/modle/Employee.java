package com.nt.modle;

import java.util.List;
import java.util.Map;

public class Employee {

	/*
	 * static { System.out.println("CLASS LOADED"); }
	 */
	
	private int eid;
	private String ename;
	private double esal;
	private List<String>proj;
	private Map<String,Double> vers;
	private Address addr;
	
	public Employee() {
		super();
	//	System.out.println("OBJECT CREATED");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
		// System.out.println("SET METHOD CALL");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public List<String> getProj() {
		return proj;
	}

	public void setProj(List<String> proj) {
		this.proj = proj;
	}

	public Map<String, Double> getVers() {
		return vers;
	}

	public void setVers(Map<String, Double> vers) {
		this.vers = vers;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", proj=" + proj + ", vers=" + vers
				+ ", addr=" + addr + "]";
	}

	
}