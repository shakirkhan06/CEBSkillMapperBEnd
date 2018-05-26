package com.niit.CEBSkillMapperBEnd;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.CEBSkillMapperBEnd.config.AppConfig;
import com.niit.CEBSkillMapperBEnd.model.EmployeeModel;
import com.niit.CEBSkillMapperBEnd.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class) 
public class testEmployeeDetails {
	
	@Autowired
	private EmployeeService employeeservice;
	
	EmployeeModel employeeemodel;
	@Before
	public void setUp() throws Exception 
	{
		employeeemodel=new EmployeeModel();
	}
	@After
	public void tearDown() throws Exception 
	{
		
	}
	/*@Test//(expected = RuntimeException.class, message = "Employee ID is null")
	public void Adddata() 
	{
		employeeemodel.setEmpid(113);
		employeeemodel.setEmpname("sunar");
		employeeemodel.setPassword("Khan");
		employeeemodel.setAge(25);
		employeeemodel.setGender("Male");
		employeeemodel.setAddress("Vellore");
		employeeemodel.setMobile(1234567890);
		employeeemodel.setEmail("Shakir@gmail.com");
		employeeemodel.setQualification("Msc");
		assertEquals("Success",true,employeeservice.addServe(employeeemodel));
		//assertNotNull(employeeservice.addServe(employeeemodel));
	}
	//@Test
	//public void deletebyId()
	//{
	//	assertEquals("Emp Id not found",true,employeeservice.deleteServeById(113));
	//}
	@Test
	public void Updatedata() 
	{
		employeeemodel=employeeservice.getServeById(111);
		employeeemodel.setEmpname("rajesh");
		assertEquals("Success",true,employeeservice.updateServeById(employeeemodel));
	}
	@Test
	public void getEmployeeById() {
		EmployeeModel obj;
		obj = employeeservice.getServeById(111);
		assertEquals("Success", true, obj!=null);
		 
	}
	@Test
	public void getAllEmployees() {
		List<EmployeeModel> employeeList = new ArrayList<EmployeeModel>();
		employeeList = employeeservice.getServeAllEmployees();
		for(EmployeeModel allemp:employeeList)
		System.out.println(allemp.getEmpname());
		assertEquals("Success", true, employeeList.size() != 0);
	}
	*/
}
