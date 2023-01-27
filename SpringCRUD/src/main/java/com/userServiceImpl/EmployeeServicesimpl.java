package com.userServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repo.EmployeeRepo;
import com.userService.EmployeeService;


@Service
public class EmployeeServicesimpl implements EmployeeService{
	
	

		@Autowired
		private EmployeeRepo employeerepo;

		@Override
		public Employee addEmp(Employee s) {
			return employeerepo.save(s);

		}

		@Override
		public Employee getemployee(int id) {

			return employeerepo.findById(id).get();
		}

//		@Override
//		public void deleteEmployeeById(int id) {
//			// TODO Auto-generated method stub
//			
//		}

		@Override
		public Employee updateStud(int id, Employee param) {
			// TODO Auto-generated method stub
			return  employeerepo.save(param);
		}

		@Override
		public List<Employee> allEmployee() {
			// TODO Auto-generated method stub
			return  employeerepo.findAll();
		}

		public void delete(int id)   
		{  
		employeerepo.deleteById(id);  
		}  

		
	}



