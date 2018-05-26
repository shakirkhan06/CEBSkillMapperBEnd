package com.niit.CEBSkillMapperBEnd.service;

import java.util.List;

import com.niit.CEBSkillMapperBEnd.model.EmployeeModel;

public interface EmployeeService {
	public boolean addServe(EmployeeModel employeemodel);
	  public boolean deleteServeById(int empid);
	  public EmployeeModel getServeById(int empid);
	  public boolean updateServeById(EmployeeModel empid);
	  public List<EmployeeModel> getServeAllEmployees();
	 

}
