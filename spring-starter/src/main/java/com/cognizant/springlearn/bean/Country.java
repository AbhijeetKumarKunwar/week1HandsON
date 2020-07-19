package com.cognizant.springlearn.bean;

import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;

import com.cognizant.springlearn.SpringStarterApplication;

public class Country {
	public Country() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringStarterApplication.class);
	@NonNull
	@Size(min=2,max=2,message="Country code should be 2 characters")
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
		LOGGER.debug("Inside the set code");
	}

	public String getName() {
		return name;

	}

	public Country(String code, String name) {
		super();
		LOGGER.debug("Inside the country constructor");
		this.code = code;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
		LOGGER.debug("inside the set name");
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
