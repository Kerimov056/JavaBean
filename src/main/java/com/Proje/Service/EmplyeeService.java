package com.Proje.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proje.Dto.EmployeeUpdateDto;
import com.Proje.Model.Emplyee;
import com.Proje.Repository.EmployeeRepository;

@Service
public class EmplyeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Emplyee> getAllEmployeList(){
		return employeeRepository.getAllEmployeList();
	}
	
	public Emplyee getByEmpId(String id) {
		return employeeRepository.getByEmployee(id);
	}
	
	public void createdEmploye(Emplyee emp) {
		employeeRepository.createdEmployee(emp);
	}
	
	public void updateEmploye(String id, EmployeeUpdateDto dto) {
	    Emplyee emp = employeeRepository.getByEmployee(id);
	    if (emp == null) {
	        throw new RuntimeException("Employee not found with id: " + id);
	    }
	    emp.setFirstName(dto.getFirstName());
	    emp.setLastName(dto.getLastName());
	    employeeRepository.updateEmployee(emp);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteEmployee(id);
	}
	
	public List<Emplyee> getParamsList(String firstName, String lastName){
		return employeeRepository.getParams(firstName, lastName);
	}
}
