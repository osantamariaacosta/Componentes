package com.cenfotec.distribuidora.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cenfotec.distribuidora.domain.Delear;
import com.cenfotec.distribuidora.domain.Employee;
import com.cenfotec.distribuidora.repository.EmployeeRepository;


@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/empleados/{id}")
	public String showEmployees(@PathVariable("id") int id, Model model) {
	    model.addAttribute("delear", id);
	    model.addAttribute("list", repo.findByIdDelear(id));
		return "empleados";
	}
	
	@GetMapping("/saveEmpleados/{id}")
	public String showFormEmployees(@PathVariable("id") int id, Model model) {
	    model.addAttribute("delear", id);
	    Employee employee = new Employee();
	    employee.setIdDelear(id);
	    model.addAttribute("employee", employee);
		return "saveEmpleados";
	}
	
	
	@PostMapping("/saveNuevo")
	public String save(Employee employee, Model model) {
		repo.save(employee);
	return "redirect:/"; 
}

}
