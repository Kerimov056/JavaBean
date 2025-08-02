package com.Proje.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Proje.Model.Emplyee;

@Repository
public class EmployeeRepository {

	@Autowired
	private List<Emplyee> empList;

	public List<Emplyee> getAllEmployeList(){
		return empList;
	}
	
	public Emplyee getByEmployee(String id) {
	
		Emplyee findEmployeeEmplyee = null;
		for(Emplyee emplyee : empList) {
			if(id.equals(emplyee.getId())){
				findEmployeeEmplyee = emplyee;
				break;
			}
		}
		return findEmployeeEmplyee;
	}
	
	public void createdEmployee(Emplyee emp) {
		empList.add(emp);
	}
	
	public void updateEmployee(Emplyee updatedEmp) {
	    for (int i = 0; i < empList.size(); i++) {
	        if (empList.get(i).getId().equals(updatedEmp.getId())) {
	            empList.set(i, updatedEmp);
	            return;
	        }
	    }
	}
	
	public void deleteEmployee(String id) {
		Emplyee findEmplyee = getByEmployee(id);
		if(findEmplyee == null) throw new RuntimeException("Employee not found with id: " + id);
		empList.remove(findEmplyee);
	}

}
