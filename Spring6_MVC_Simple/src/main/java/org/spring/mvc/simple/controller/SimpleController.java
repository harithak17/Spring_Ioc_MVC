package org.spring.mvc.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public String hello(Model m)
	{
		m.addAttribute("greet","welcome to our java session");
		return "SimpleJSP";
	}
}
