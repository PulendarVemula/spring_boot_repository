package com.createiq.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void add(Employee employee) {

		hibernateTemplate.save(employee);
	}

	@Override
	public void update(Employee employee) {

		hibernateTemplate.update(employee);
	}

	@Override
	public void deleteById(Integer eid) {

		Employee entity = new Employee();
		entity.setEid(eid);
		hibernateTemplate.delete(entity);
	}

	@Override
	public List<Employee> findAll() {

//		List<Employee> employees = hibernateTemplate.que
		return null;
	}

	@Override
	public List<Employee> findByName(String ename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
