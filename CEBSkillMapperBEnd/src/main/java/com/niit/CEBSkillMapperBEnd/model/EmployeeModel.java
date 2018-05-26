package com.niit.CEBSkillMapperBEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="Employee")
public class EmployeeModel {
@Id
private int empid;
@NonNull
@Column(nullable=false)
private String empname;
@NonNull
private String password;
@NonNull
private int age;
@NonNull
private String gender;
@NonNull
private String address;
@NonNull
private int mobile;
@NonNull
private String email;
@NonNull
private String qualification;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public void getEmpid(int i) {
	// TODO Auto-generated method stub
	
}


}