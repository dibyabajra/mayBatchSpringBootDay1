package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping({"/login","/"})
	public String callLoginPage() {
		return "login";
	
	}
	
	
	@GetMapping("/register")
	public String callRegistrationPage() {
		
		
		return "registration";
	}
	//register a user
	@PostMapping("/registerEmp")
	public String registerEmployee(@ModelAttribute EmployeeDTO employeeDTO, Model model) {
		//@RequestParam -->5 times             Alternative ---@ModelAttribute   EmployeeDTO employeeDTO
		        
		employeeService.registerEmp(employeeDTO);
		
		model.addAttribute("msg","Record Inserted successfully");
		return "registration";
	}
	
	@PostMapping("/loginValidate")
	public String authenticate(@RequestParam String emailId,@RequestParam String password,Model model) {
		EmployeeDTO employeeDTO=employeeService.authenticate(emailId,password);
		
		if(employeeDTO!=null) {
			   //true/valid
			model.addAttribute("employeeDTO", employeeDTO);
			//return "congrats";
			return "congratulations";
		} else {
			//false/not valid 
			
			model.addAttribute("message", "Wrong credential...Re-Try!!");
			return "login";
		}
	
	}
	
	@GetMapping("/fetchAll")
	public String fetchAllRecords(Model model) {
		List<EmployeeDTO> employeeDtoList=employeeService.findAllEmployees();
		
		model.addAttribute("employeeDtoList",employeeDtoList);	
		System.out.println(employeeDtoList);
		return "showAll";
	}
	//delete operation
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam int employeeId, Model model) {
		
		employeeService.deleteEmp(employeeId);
		
		model.addAttribute("message", "Record deleted successfully!!!");
		//return "info";
		return "redirect:/fetchAll";
	}
	
	//edit operation		//updateEmployee
	
	@GetMapping("/updateEmployee")
	public String updateEmp(@RequestParam int employeeId, Model model) {
		EmployeeDTO employeeDTO=employeeService.fetchRecord(employeeId);
		
		model.addAttribute("employeeDTO", employeeDTO);
		return "updateEmployee";
	}
}

//commit 3 line added in git class2

