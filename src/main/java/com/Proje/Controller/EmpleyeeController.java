package com.Proje.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Proje.Dto.EmployeeUpdateDto;
import com.Proje.Model.Emplyee;
import com.Proje.Service.EmplyeeService;

@RestController
@RequestMapping("/rest/api")
public class EmpleyeeController {

	@Autowired
	private EmplyeeService emplyeeService;
	
	@GetMapping("/employee-list")
	public List<Emplyee> employeAllList(){
		return emplyeeService.getAllEmployeList();
	}
	
	@GetMapping(path = "/employee-list/{id}")
	public Emplyee getFindEmploye(@PathVariable(name = "id", required = true) String id) {
		return emplyeeService.getByEmpId(id);
	}
	
	@PostMapping("/create-employee")
	public  ResponseEntity<String> createdEmp(@RequestBody Emplyee emplyee) {
		emplyeeService.createdEmploye(emplyee);
		return ResponseEntity.status(201).body("Employee created successfully!");
	}
	
	@PutMapping("/employee-update/{id}")
	public ResponseEntity<String> updateEmployee(
	        @PathVariable String id,
	        @RequestBody EmployeeUpdateDto employeeUpdateDto) {

	    emplyeeService.updateEmploye(id, employeeUpdateDto);
	    return ResponseEntity.ok("Employee updated successfully!");
	}
	
	@DeleteMapping("/employee-delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(name = "id", required = true) String id){
		emplyeeService.deleteEmployee(id);
		return ResponseEntity.ok("Deleted Employee");
	}
}
