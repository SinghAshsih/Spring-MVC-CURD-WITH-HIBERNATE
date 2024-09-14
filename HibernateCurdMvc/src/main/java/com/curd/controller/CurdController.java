package com.curd.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curd.model.Employee;
import com.curd.service.EmployeeService;

@Controller
public class CurdController {
	@Autowired
	private EmployeeService employeeService;
	// http://localhost:8080/SpringMVCHibernateCRUD/employees

	private static final Logger logger = LogManager.getLogger(CurdController.class);

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String listemployees(Model model) {

		model.addAttribute("employee", new Employee());
		model.addAttribute("employeeList", employeeService.listEmployees());
		logger.info("CurdController: Handling employees request");
		return "employee";
	}

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addemployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("employeeList", employeeService.listEmployees());
			logger.error("CurdController: Validation errors while adding employee: " + result.getAllErrors());
			return "employee";
		}

		if (employee.getEmployeeId() == null || employee.getEmployeeId() == 0) {
			// new employee, add it
			employeeService.addEmployee(employee);
		} else {
			// existing employee, call update
			employeeService.updateEmployee(employee);
		}
		logger.info("CurdController: Handling /employee/add request");

		return "redirect:/employees";
	}

	@RequestMapping("/employee/remove/{id}")
	public String removeemployee(@PathVariable("id") int id) {

		employeeService.removeEmployee(id);
		logger.info("CurdController: Handling /employee/remove/{id} request");
		return "redirect:/employees";
	}

	@RequestMapping("/employee/edit/{id}")
	public String editemployee(@PathVariable("id") int id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		model.addAttribute("employeeList", employeeService.listEmployees());
		logger.info("CurdController: Handling /employee/edit/{id} request");
		return "employee";
	}
}
