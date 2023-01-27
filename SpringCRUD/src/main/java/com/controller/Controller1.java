package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.userService.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class Controller1 {
	@Autowired
	private EmployeeService EmpSer;

	@PostMapping("/addRec") // localhost:8080/addRec
	public Employee getStu(@RequestBody @Valid Employee s)

	{
		return EmpSer.addEmp(s);

	}

	//
	@GetMapping("/Employee/{id}")
	public Employee abc(@PathVariable int id) {
		return EmpSer.getemployee(id);
	}

	@GetMapping("/allEmp")
	public List<Employee> ok1() {
		return EmpSer.allEmployee();
	}

	@PutMapping("/update/{i}")
	public Employee abcd(@PathVariable int i, @RequestBody Employee s) {
		return EmpSer.updateStud(i, s);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		EmpSer.delete(id);
	}

}
