package com.createiq.ems;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.createiq.ems.controller.EmployeeController;
import com.createiq.ems.entity.Employee;
import com.createiq.ems.service.EmployeeService;

@ExtendWith(SpringExtension.class)	
@WebMvcTest(EmployeeController.class)
public class StandAloneControllerTests {
	
	@MockBean
    EmployeeService employeeService; 
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testFindAll() throws Exception {
		
		Employee employee1 = new Employee(1, "Ramu", 2000.00);
		
		Employee employee2 = new Employee(2, "Somu", 5000.00);
		
	List<Employee>  employees = Arrays.asList(employee1,employee2);
	
	Mockito.when(employeeService.findAll()).thenReturn(employees);
	
	mockMvc.perform(get("/EmP/allEmployees"))
	.andExpect(status().isOk())
	.andExpect(jsonPath("$", Matchers.hasSize(2)))
	.andExpect(jsonPath("$[0].eid", Matchers.is(1)))
    .andExpect(jsonPath("$[0].ename", Matchers.is("Ramu")))
    .andExpect(jsonPath("$[0].esalary", Matchers.is(2000.00)));
	}

}
