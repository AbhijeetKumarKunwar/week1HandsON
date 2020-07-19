package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.bean.Department;
import com.cognizant.springlearn.dao.DepartmentDao;

@Service
@Component
public class DepartmentService {

	@Autowired
	private DepartmentDao depd;
	
	public ArrayList<Department> getAllDepartment()
	{
		return depd.getAllDepart();
		
	}
}
