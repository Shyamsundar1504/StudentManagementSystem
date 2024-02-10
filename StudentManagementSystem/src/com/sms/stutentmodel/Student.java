package com.sms.stutentmodel;

public class Student {
private int id ;
private String name;
private String email;
private String dob;

public Student() {}
public Student(int id, String name, String email, String dob) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.dob = dob;
}
public Student( String name, String email, String dob) {
	super();
	
	this.name = name;
	this.email = email;
	this.dob = dob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
}
