package com.userService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Employee;


@Service
public interface EmployeeService {

	Employee addEmp(Employee s);

	Employee getemployee(int id);

	List<Employee> allEmployee();

	Employee updateStud(int id, Employee param);
	
	void  delete(int id);
	  

//		Student addStud(Student s);
//		Student getstudent(int id);
////		void deleteEmployeeById(int id);
//		Student updateStud(int id,Student param);
//		List<Student> allStudent();
//		void  delete(int id);
	}


