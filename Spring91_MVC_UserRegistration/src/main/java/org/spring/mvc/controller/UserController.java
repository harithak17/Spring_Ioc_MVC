package org.spring.mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.spring.mvc.beans.User;
import org.spring.mvc.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	Userdao dao;

	@RequestMapping("/UserRegistration")
	public String showRestrationPage(Model model)
	{
		model.addAttribute("user", new User());
		return "User_Registration";
	}
	
	@RequestMapping("/ViewAllUsers")
	public String showListPage(Model model)
	{	
		List<User> list=dao.getUsers();
		model.addAttribute("list",list);
		return "User_List";
	}
	
	@RequestMapping(value="/AddUserdetails",method=RequestMethod.POST)
	public String saveRestrationPage(@Valid @ModelAttribute("user") User u,BindingResult br)
	{
		System.out.println("Inside add new User");
		System.out.println(u);
		System.out.println("Has errors:"+br.hasErrors());
		 if(br.hasErrors())  
	        {  
	            return "User_Registration";  
	        }  
		 else
		 {
			 dao.save(u);
			 return "redirect:/ViewAllUsers";
		 }
	}
	
	@RequestMapping(value="/deleteuser/{id}",method = RequestMethod.GET)
	public String deleteUser(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/ViewAllUsers";
	}
	
	@RequestMapping(value="/edituser/{id}",method=RequestMethod.GET)
	public String getUserbyId(@PathVariable int id, Model m)
	{
		System.out.println("Id:--->"+id);
		User obj=dao.getUserById(id); 		
		m.addAttribute("user",obj);
		return "User_Edit";
	}
	
	@RequestMapping(value="/UpdateUserdetails",method=RequestMethod.POST)	
	public String updateUser(@ModelAttribute("user") User u)
	{
		System.out.println("Update");
		System.out.println("Update Object"+u);
		int result=dao.update(u);
		System.out.println("Update query:"+result);
		return "redirect:/ViewAllUsers";
	}
	
}
