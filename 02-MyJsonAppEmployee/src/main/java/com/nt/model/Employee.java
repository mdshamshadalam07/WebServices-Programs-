package com.nt.model;

 public class Employee {
 private Integer empId;
 private String empName;
 private float empSal;
 
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

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}

}
