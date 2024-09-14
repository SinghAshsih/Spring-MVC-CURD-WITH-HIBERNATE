package com.curd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_Id")
	private Integer employeeId;

	@NotNull(message = "First Name cannot be null")
	@Size(min = 1, max = 50, message = "First Name must be between 1 and 50 characters")
	@Column(name = "FirstName")
	private String firstName;

	@NotNull(message = "Last Name cannot be null")
	@Size(min = 1, max = 50, message = "Last Name must be between 1 and 50 characters")
	@Column(name = "LastName")
	private String lastName;

	@NotNull(message = "Age cannot be null")
	@Min(value = 21, message = "Age should not be less than 21")
	@Max(value = 50, message = "Age should not be greater than 50")
	@Column(name = "Age")
	private Integer age;

	@NotNull(message = "Education cannot be null")
	@Size(min = 1, max = 100, message = "Education must be between 1 and 100 characters")
	@Column(name = "Education")
	private String education;

	@NotNull(message = "Salary cannot be null")
	@Min(value = 0, message = "Salary should not be less than 0")
	@Column(name = "Salary")
	private Double salary;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}