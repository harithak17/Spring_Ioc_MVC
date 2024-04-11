package org.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/First")
public class FirstController {
	@RequestMapping("/processForm")
	public String redirectPage()
	{
		return "Hello";
	}
	
	// new controller method to read data from form 
	// add data to model
	
	@RequestMapping("/processData")
	public String processData(HttpServletRequest req,Model m)
	{
		// read request parameter from HTML form
		String name=req.getParameter("studName");
		
		// instead of line 31, @RequestParam("studName") String name
		// String read param from request and bind to name
		
		// convert data to uppercase
		name=name.toUpperCase();
		
		//create result
		String result="Hello, "+name;
		// add result to model
		m.addAttribute("message",result);
		return "Hello";
	}
	
	@RequestMapping("/processDataOne")
	public String processDataOne(@RequestParam("studName") String name,Model m)
	{	
		
		// instead of line 31, @RequestParam("studName") String name
		// String read param from request and bind to name
		
		// convert data to uppercase
		name=name.toUpperCase();
		
		//create result
		String result="Hello, my friend "+name;
		// add result to model
		m.addAttribute("message",result);
		return "Hello";
	}
}
