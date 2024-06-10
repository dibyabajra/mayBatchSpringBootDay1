package com.service;

import java.util.List;

import com.dto.EmployeeDTO;

public interface EmployeeService {

	void registerEmp(EmployeeDTO employeeDTO);

	EmployeeDTO authenticate(String emailId, String password);

	List<EmployeeDTO> findAllEmployees();

	void deleteEmp(int employeeId);

	EmployeeDTO fetchRecord(int employeeId);

	void updateEmployee(EmployeeDTO employeeDTO);

}

