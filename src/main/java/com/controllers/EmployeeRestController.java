package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@RestController

public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	//fetch all records
		@GetMapping("/e"
				+ "mployees")
		public List<EmployeeDTO> fetchAllRecords() {
		List<EmployeeDTO>	employeeDtoList=employeeService.findAllEmployees();		   
		   
			return employeeDtoList;
		}
		
		
		//fetch a particular record on basis of id
				@GetMapping("/employees/{employeeId}") //localhost:666/employees/2
				public EmployeeDTO fetchRecordOfEmployee(@PathVariable int employeeId) {
				EmployeeDTO	employeeDto=employeeService.fetchRecord(employeeId)	;   
				   
					return employeeDto;
				}
					
				//localhost:888/employees
				
				//register a user
				@PostMapping("/employees")
				public String registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
										        
					employeeService.registerEmp(employeeDTO);
					
					return "registered successfully";
				}
				
				@PutMapping("/employees")
				public String updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
										        
					employeeService.registerEmp(employeeDTO); //here it will work as update because we are providing employeeID
					
					return "updated successfully";
					}
				
				@DeleteMapping("/employees/{employeeId}") //localhost:666/employees/2
				public String deleteRecordOfEmployee(@PathVariable int employeeId) {
				employeeService.deleteEmp(employeeId);  
				   
					return "deleted successfully";
				}
}

