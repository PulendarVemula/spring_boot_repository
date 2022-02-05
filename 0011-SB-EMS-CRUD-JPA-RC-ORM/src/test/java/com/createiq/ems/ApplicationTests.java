package com.createiq.ems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.createiq.ems.controller.EmployeeController;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private EmployeeController controller;

	@Test
	void contextLoads() {
		
		assertThat(controller).isNotNull();
	}

}
