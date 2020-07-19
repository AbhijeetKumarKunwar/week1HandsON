package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.bean.CountryList;
import com.cognizant.springlearn.bean.Employee;
@Component
public class EmployeeDao {

	public static ArrayList<Employee> emp=new ArrayList<>();

	
	public EmployeeDao(ArrayList<Employee> emp1)
	{
		emp=emp1;

	}
	public EmployeeDao()
	{
		
	}

	public static ArrayList<Employee> getEmp() {
		return emp;
	}

	public static void setEmp(ArrayList<Employee> emp) {
		EmployeeDao.emp = emp;
	}

	
	}
	

	

