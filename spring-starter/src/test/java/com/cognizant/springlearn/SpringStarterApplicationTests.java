package com.cognizant.springlearn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.catalina.connector.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cognizant.springlearn.bean.Country;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringStarterApplicationTests {

	private MockMvc mockmvc;
	ObjectMapper ob=new ObjectMapper();
	@Autowired
	private WebApplicationContext context;
	@Before()
	private void setup()
	{
		mockmvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void AddCountry() throws Exception
	{
		Country ct=new Country();
		ct.setCode("CN");
		ct.setName("China");
		String jasonRequest=ob.writeValueAsString(ct);
		MvcResult result=mockmvc.perform(post("/countryService/addCountry").content(jasonRequest).content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String rs=result.getResponse().getContentAsString();
		Response response=ob.readValue(rs, Response.class);
        Assert.assertEquals(response.getStatus(), Boolean.TRUE);	}

}
