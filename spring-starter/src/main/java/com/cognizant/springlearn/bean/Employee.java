package com.cognizant.springlearn.bean;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

	public Employee()
	{
		
	}
	@NonNull
	@Size(min=2,max=30,message="size should be between 2 to 30")
	private String name;
	private int id;
	@NonNull
	private int salary;
	@NonNull
	private String permanent;
	@NonNull
	private String dateofbirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	
	public Employee(String name, int id, int salary, String permanent, String dateofbirth) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.permanent = permanent;
		this.dateofbirth = dateofbirth;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public String getPermanent() {
		return permanent;
	}
	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateofbirth=" + dateofbirth + "]";
	}

}
