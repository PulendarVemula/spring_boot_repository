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

import com.createiq.ems.controller.EmployeeRestController;
import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

@ExtendWith(SpringExtension.class)	
@WebMvcTest(EmployeeRestController.class)
public class StandAloneControllerTests {
	
	@MockBean
    EmployeeService employeeService; 
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testFindAll() throws Exception {
		
		Employee employee1 = new Employee(52260, "Ramu", 6000.00);
		
		Employee employee2 = new Employee(52360, "Somu", 5000.00);
		
	List<Employee>  employees = Arrays.asList(employee1,employee2);
	
	Mockito.when(employeeService.findAll()).thenReturn(employees);
	
	mockMvc.perform(get("/emPloyee/allEmployees"))
	.andExpect(status().isOk())
	.andExpect(jsonPath("$", Matchers.hasSize(6)))
	.andExpect(jsonPath("$[1].eid", Matchers.is(52260)))
    .andExpect(jsonPath("$[1].ename", Matchers.is("Ramu")))
    .andExpect(jsonPath("$[1].esalary", Matchers.is(6000.00)));
	}

}
