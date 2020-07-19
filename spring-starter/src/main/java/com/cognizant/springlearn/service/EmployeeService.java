package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.Iterator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.SpringStarterApplication;
import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.exception.EmployeeNotFoundExceptoin;

@Service
@Component
public class EmployeeService {
	//@Transactional 
	@Autowired
	SpringStarterApplication sp;
	public  ArrayList<Employee> cnt=new ArrayList<>();
	
	{
		cnt=sp.getEmployee();
	}
	public ArrayList<Employee> getAllEmployee()
	{
		return cnt;
	}
	public void addEmp(Employee emp)
	{
		cnt.add(emp);
	}
	public void updateEmp(Employee empl) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<cnt.size();i++)
		{
			if(cnt.get(i).getId()==empl.getId())
			{
				flag=1;
				cnt.set(i,empl);
				break;
			}
		}
		if(flag==0)
		{
			throw new EmployeeNotFoundExceptoin("This employee is not belong to us");
		}
		
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		Iterator<Employee> it=cnt.iterator();
		int flag=0;
		while(it.hasNext())
		{
			
			Employee em=it.next();
			if(em.getId()==id)
			{
				it.remove();
				flag=1;
				break;
			}
		}
		if(flag==0)
			throw new EmployeeNotFoundExceptoin("This employee is not found here");
		
	}
	
	
	}


