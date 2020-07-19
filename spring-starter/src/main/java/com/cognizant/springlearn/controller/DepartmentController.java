package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.bean.Department;
import com.cognizant.springlearn.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService depser;
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartment()
	{
		return depser.getAllDepartment();
	}
}
