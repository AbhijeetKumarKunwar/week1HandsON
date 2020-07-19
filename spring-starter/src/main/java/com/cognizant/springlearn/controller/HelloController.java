/**
 * 
 */
package com.cognizant.springlearn.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringStarterApplication;
import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.bean.CountryList;
import com.cognizant.springlearn.bean.DateFormat;
import com.cognizant.springlearn.service.CountryService;

/**
 * @author DELL
 *
 */
@RestController
public class HelloController {
	
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(SpringStarterApplication.class);

	@GetMapping("/hello")
	public String sayHello()
	{
		
		LOGGER.info("START");
		LOGGER.info("END");
		return "Hello world";
	}

}
