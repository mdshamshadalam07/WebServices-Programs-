package com.nt.modle;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	    
	    @XmlAttribute(name="id")
		private Integer empId;
	    
	    @XmlElement(name="employee-name", required = true)
	    private String  empName;
	    
	    @XmlElement(name="Employee-salary")
	    private Double  empSal;
	    
	    @XmlTransient
	    private String  empwd;
	    
	    @XmlElementWrapper(name="Project")
	    @XmlElement(name="Project-Name")
	    private Set<String> empProj;
	    
	    @XmlElementWrapper(name="Project-Clients")
	//  @XmlElement(name="Project-Clients")
	    private Map<String,String>clients;
	    
	    @XmlElement(name="Address")
		private Address addr;
	    
	    @XmlElement(name="Subject")
	    @XmlElementWrapper
	    private Set<String> subjects;
	    
	    @XmlElement(name="Marks")
	    private Map<String,Integer> marks;
	    
	    @XmlElement(name="Course")
	    private Course course;
	    @XmlElement(name = "student")
	    private Student student;
	    public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

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

		public Double getEmpSal() {
			return empSal;
		}

		public void setEmpSal(Double empSal) {
			this.empSal = empSal;
		}

		public String getEmpwd() {
			return empwd;
		}

		public void setEmpwd(String empwd) {
			this.empwd = empwd;
		}

		public Set<String> getEmpProj() {
			return empProj;
		}

		public void setEmpProj(Set<String> empProj) {
			this.empProj = empProj;
		}

		public Map<String, String> getClients() {
			return clients;
		}

		public void setClients(Map<String, String> clients) {
			this.clients = clients;
		}

		public Address getAddr() {
			return addr;
		}

		public void setAddr(Address addr) {
			this.addr = addr;
		}

		public Set<String> getSubjects() {
			return subjects;
		}

		public void setSubjects(Set<String> subjects) {
			this.subjects = subjects;
		}

		public Map<String, Integer> getMarks() {
			return marks;
		}

		public void setMarks(Map<String, Integer> marks) {
			this.marks = marks;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empwd=" + empwd
					+ ", empProj=" + empProj + ", clients=" + clients + ", addr=" + addr + ", subjects=" + subjects
					+ ", marks=" + marks + ", course=" + course + ", getEmpId()=" + getEmpId() + ", getEmpName()="
					+ getEmpName() + ", getEmpSal()=" + getEmpSal() + ", getEmpwd()=" + getEmpwd() + ", getEmpProj()="
					+ getEmpProj() + ", getClients()=" + getClients() + ", getAddr()=" + getAddr() + ", getSubjects()="
					+ getSubjects() + ", getMarks()=" + getMarks() + ", getCourse()=" + getCourse() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}	
}