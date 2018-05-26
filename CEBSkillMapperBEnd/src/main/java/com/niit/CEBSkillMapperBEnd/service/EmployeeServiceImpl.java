package com.niit.CEBSkillMapperBEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.CEBSkillMapperBEnd.dao.EmployeeDao;
import com.niit.CEBSkillMapperBEnd.model.EmployeeModel;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	
	public boolean addServe(EmployeeModel employeemodel) {
		return (employeedao.addEmployee(employeemodel));	
	}
	
	public boolean deleteServeById(int empid) {
		return (employeedao.deleteEmployee(empid));
	}
	
	
	public boolean updateServeById(EmployeeModel empid) 
	{
		return (employeedao.updateEmployee(empid));
	}

	@Override
	public EmployeeModel getServeById(int empid) {
		return (employeedao.getEmployeeDetailById(empid));
	}

	@Override
	public List<EmployeeModel> getServeAllEmployees() {
		// TODO Auto-generated method stub
		return employeedao.getAllEmployeeDetails();
	}

	/*@Override
	public boolean updateserve(EmployeeModel employeemodel) {
		// TODO Auto-generated method stub
		return (employeedao.updateEmployeeDetail(employeemodel);
	}*/

}
