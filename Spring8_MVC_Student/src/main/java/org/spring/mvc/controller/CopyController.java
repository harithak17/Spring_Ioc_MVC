package org.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CopyController {
	
	@RequestMapping("/processForm")
	public String redirectPage()
	{
		return "Hello";
	}

}
