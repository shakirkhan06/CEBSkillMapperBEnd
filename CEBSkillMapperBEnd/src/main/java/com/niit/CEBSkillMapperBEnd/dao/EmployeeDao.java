package com.niit.CEBSkillMapperBEnd.dao;

import java.util.List;

import com.niit.CEBSkillMapperBEnd.model.EmployeeModel;

public interface EmployeeDao 
{
	
	public List<EmployeeModel> getAllEmployeeDetails();
	public EmployeeModel getEmployeeDetail(EmployeeModel empid);
	public EmployeeModel getEmployeeDetailById(int  empid);
	public boolean updateEmployee(EmployeeModel empid);
	public boolean addEmployee(EmployeeModel obj);
	public boolean deleteEmployee(int empid);
}
