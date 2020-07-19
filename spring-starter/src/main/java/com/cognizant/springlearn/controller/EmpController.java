package com.cognizant.springlearn.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.service.EmployeeService;

@RestController
public class EmpController {
	@Autowired
	private EmployeeService empser;
	@GetMapping("/employee")
	public ArrayList<Employee>  getAllEmp()
	{
		return empser.getAllEmployee();
		
		
	
	}
	@PostMapping("/addEmp")
	public void addemp(@RequestBody @Valid  Employee emp)
	{
		System.out.println("The emp to be added"+emp.toString());
		empser.addEmp(emp);
	}
	@PutMapping("/updateEmp")
	public void update(@RequestBody @Valid Employee empl)
	{
		empser.updateEmp(empl);
	}
	@DeleteMapping("/deleteEmp/{id}")
	public void delete(@PathVariable int id)
	{
		empser.delete(id);
	}


}
