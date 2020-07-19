package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.SpringStarterApplication;
import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.bean.CountryList;

@Service
public class CountryService {
	@Autowired
	SpringStarterApplication sp;
	ArrayList<Country> cnt=new ArrayList<>();
	
	{
		cnt=sp.displayCountries();
	}
	public Country getCountry(String code)
	{
		//ApplicationContext context=new 
			//	ClassPathXmlApplicationContext("country.xml");
		//CountryList countrylist=(CountryList)context.getBean("countrylist");
		for(Country cl:cnt)
		{
			if(cl.getCode().equalsIgnoreCase(code))
				return cl;
		}
		return null;
	}
	public ArrayList<Country> getAllCon() {
		// TODO Auto-generated method stub
		return cnt;
	}
	public void setCountry(Country count) {
		// TODO Auto-generated method stub
		cnt.add(count);
		
	}
}
