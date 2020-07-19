package com.cognizant.springlearn.bean;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CountryList {
	private static ArrayList<Country> countryList=new ArrayList<>();

	public CountryList()
	{
		
	}

	public ArrayList<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<Country> countryList) {
		this.countryList = countryList;
	}

	public CountryList(ArrayList<Country> countryList) {
		super();
		this.countryList = countryList;
	}
	
	
	
	

}
