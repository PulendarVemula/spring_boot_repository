package com.createiq.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.repository.EmployeeRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DaoTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void testFindAll() {
		
		
//		Employee employee1 = new Employee(10, "Dhamu", 200.00);
//		Employee employee2 = new Employee(11, "Sahimu", 200.00);
		
//		List<Employee> employees = Arrays.asList(employee1,employee2);
		
//		when(employeeRepository.findAll()).thenReturn(employees);
		
		List<Employee> empList = employeeRepository.findAll();
		
		assertEquals(3, empList.size());
	}

}
