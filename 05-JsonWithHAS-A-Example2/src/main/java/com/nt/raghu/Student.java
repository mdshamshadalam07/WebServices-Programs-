package com.nt.raghu;

public class Student {
	private int sid;
	private String sname;
	private float sfee;
	private ExamResult es;
	
	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSfee() {
		return sfee;
	}

	public void setSfee(float sfee) {
		this.sfee = sfee;
	}

	public ExamResult getEs() {
		return es;
	}

	public void setEs(ExamResult es) {
		this.es = es;
	}
}
