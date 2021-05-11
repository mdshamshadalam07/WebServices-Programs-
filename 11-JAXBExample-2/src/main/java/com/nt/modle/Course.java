package com.nt.modle;

public class Course {
	
	private int cid;
	private String cname;
	private float sfee;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getSfee() {
		return sfee;
	}
	public void setSfee(float sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", sfee=" + sfee + ", getCid()=" + getCid() + ", getCname()="
				+ getCname() + ", getSfee()=" + getSfee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
