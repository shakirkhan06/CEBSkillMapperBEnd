package com.niit.CEBSkillMapperBEnd.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.CEBSkillMapperBEnd.dao.EmployeeDao;
import com.niit.CEBSkillMapperBEnd.model.EmployeeModel;
@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
    private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<EmployeeModel> getAllEmployeeDetails() {
		return sessionFactory.getCurrentSession().createQuery("from EmployeeModel").list();
	}
	@Override
	public EmployeeModel getEmployeeDetailById(int empid) {
		return sessionFactory.getCurrentSession().get(EmployeeModel.class, empid);
	}

	@Override
	public boolean updateEmployee(EmployeeModel obj) {
		sessionFactory.getCurrentSession().update(obj);
		
		return true;
		}

	public EmployeeModel getEmployeeDetail(int empid) {
		// TODO Auto-generated method stub
		return (EmployeeModel) sessionFactory.getCurrentSession().createQuery("from EmployeeModel where empid="+empid).uniqueResult();
	}
	public boolean addEmployee(EmployeeModel obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
		return true;
	}
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		EmployeeModel employeemodel=getEmployeeDetail(empid);
		if(employeemodel!=null)
		{
			sessionFactory.getCurrentSession().delete(employeemodel);
				return true;
		}
		else
			return false;
	}
	@Override
	public EmployeeModel getEmployeeDetail(EmployeeModel empid) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
