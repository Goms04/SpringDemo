package com.goms.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetEmployees() throws Exception {
		
		mockMvc.perform(get("/"))
			.andDo(print())   //résultat affiché en console
			.andExpect(status().isOk())  //vérififier si valide
			.andExpect(view().name("home")) //vérifier si la view est effectivement home
			.andExpect(content().string(containsString("Sophie"))); //trouver laurent sur ma page
		
	}
	
}
