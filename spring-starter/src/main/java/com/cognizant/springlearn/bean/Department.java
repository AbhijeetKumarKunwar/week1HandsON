package com.cognizant.springlearn.bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.springlearn.SpringStarterApplication;
public class Department {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringStarterApplication.class);

	private String name;
	private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public Department(String name, String code) {
		super();
		LOGGER.debug("Constructor of department is populating ");
		this.name = name;
		this.code = code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", code=" + code + "]";
	}

}
