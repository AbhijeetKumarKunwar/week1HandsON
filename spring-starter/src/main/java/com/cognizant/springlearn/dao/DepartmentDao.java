package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.bean.Department;

@Component
public class DepartmentDao {
	private static ArrayList<Department> dept=new ArrayList<>();
	public DepartmentDao(ArrayList<Department> dep)
	{
		dept=dep;
	}
	public DepartmentDao()
	{
		
	}
	public static ArrayList<Department> getDept() {
		return dept;
	}
	public static void setDept(ArrayList<Department> dept) {
		DepartmentDao.dept = dept;
	}
	public ArrayList<Department> getAllDepart()
	{

		ApplicationContext context=new 
				ClassPathXmlApplicationContext("employee.xml");
		DepartmentDao d=(DepartmentDao) context.getBean("depart");
		 return d.getDept();
	
		
	}
	

}
