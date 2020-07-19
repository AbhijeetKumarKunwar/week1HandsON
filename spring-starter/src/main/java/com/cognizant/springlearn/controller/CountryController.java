package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringStarterApplication;
import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.bean.CountryList;
import com.cognizant.springlearn.bean.Respone;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;
@RestController
//@RequestMapping("/countryService")
public class CountryController {

	@Autowired
	private CountryService cs;
	
	@RequestMapping(value="/country", method=RequestMethod.GET)
	public Country getCountryInda()
	{
		ApplicationContext context=new 
				ClassPathXmlApplicationContext("country.xml");
		Country country=(Country)context.getBean("country");
		return country;
	}
	@GetMapping("/countries")
	public ArrayList<Country> getAllCountries()
	{
		
		return cs.getAllCon();
		
	}
	@GetMapping("countryByCode/{code}")
	public Country getCountry(@PathVariable String code)
	{
		Country country= cs.getCountry(code);
	   
		if(country==null)
		{
			throw new CountryNotFoundException("COuntry does not exit");
		}
		return country;
	}
	@PostMapping("/addCountry")
	public Respone addcountry(@RequestBody @Valid Country count)
	{
		
	
		   cs.setCountry(count);
		   return new Respone(count.getCode(),true);

	}
	
}
