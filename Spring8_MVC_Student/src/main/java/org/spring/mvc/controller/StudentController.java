package org.spring.mvc.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import org.spring.mvc.bean.Student;

@Controller
@RequestMapping("/Student")
public class StudentController {

	// pre process all web request coming to controller
	// StringTrimmerEditor defined in string api, it removes white space(leading and trailing)
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor obj = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, obj);
		// for every string class, apply obj class
	}

	@RequestMapping("/Showform")
	public String showForm(Model m) {
		// create student object
		Student studObj = new Student();

		// add student object to model
		m.addAttribute("student", studObj);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult result) {
//		System.out.println("Student Details" + theStudent.getFname() + "\t" + theStudent.getLname());
//		System.out.print("fname lenght:" + theStudent.getFname().length() + "\n");
//		System.out.print("fname is empty? " + theStudent.getFname().isEmpty() + "\n");
		System.out.print(result.getErrorCount());
		if (result.hasErrors())
			return "student-form";
		else
			return "student-confirmation";
	}
//	public String processForm(@ModelAttribute("student") Student theStudent) {
//		System.out.println("Student Details" + theStudent.getFname() + "\t" + theStudent.getLname());
//		return "student-confirmation";
//	}

}
