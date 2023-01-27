package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "EmployeeRecord")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int userid;
	@Column(length = 30, nullable = false, name = "Employee_names") // not to take null values.
	private String username;
	@Email(message = "invalid Email address")
	private String email;
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
	private String phone;
	private String gender;
	@Min(20)
	@Max(100)

	private int age;
	@NotBlank(message = "nationality cann't empty")

	private String nationality;

}
