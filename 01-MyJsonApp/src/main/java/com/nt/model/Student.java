package com.nt.model;

 public class Student {
 private Integer stdId;
 private String stdName;
 private float stdFee;
 
 public Student() {
	super();
	
}

public Integer getStdId() {
	return stdId;
}

public void setStdId(Integer stdId) {
	this.stdId = stdId;
}

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

public float getStdFee() {
	return stdFee;
}

public void setStdFee(float stdFee) {
	this.stdFee = stdFee;
  }

@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
   }
}
