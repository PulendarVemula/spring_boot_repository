package com.createiq.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.repository.EmployeeRepository;
import com.createiq.ems.service.EmployeeServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	
	@Test
	public void testFindAllService() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee1 = new Employee(1, "Ramu", 200.00);
		Employee employee2 = new Employee(2, "Somu", 200.00);
		Employee employee3 = new Employee(23, "Kamu", 200.00);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		when(employeeRepository.findAll()).thenReturn(employees);
		
//		test horaye
		
		List<Employee> empList = employeeService.findAll();
		
		assertEquals(3, empList.size());
//		verify(employeeRepository, times(1)).findAll();
	}
	
	@Test
	public void insertEmployee() {
		
		Employee employee1 = new Employee(456, "Pulendar", 200.00);
		
		employeeService.add(employee1);
		
//		Iterator<Employee> iterator = (Iterator<Employee>) employeeService.findAll();
//		System.out.println(iterator);
		assertEquals(null, employeeRepository.save(employee1));
	}									

}
