package com.nt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
@JsonProperty("user-id")
 private int uid;

@JsonProperty("user-name")	
 private String uname;

 @JsonIgnore 
 private String upassword;
 
 @JsonProperty("user-authority")
 private String urole;
 
  public User() {
	super();
}

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getUpassword() {
	return upassword;
}

public void setUpassword(String upassword) {
	this.upassword = upassword;
}

public String getUrole() {
	return urole;
}

public void setUrole(String urole) {
 	this.urole = urole;
  }
}
