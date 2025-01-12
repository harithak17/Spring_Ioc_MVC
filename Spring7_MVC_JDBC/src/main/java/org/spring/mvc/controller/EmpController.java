package org.spring.mvc.controller;

import java.util.List;

import org.spring.mvc.bean.Employee;
import org.spring.mvc.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	@Autowired
	EmpDao dao;
	@RequestMapping("/empForm")
	public String showForm(Model m)
	{
		m.addAttribute("command",new Employee());
		//id=0,name="",
		return "EmployeeForm";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee emp)
	{
		dao.save(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewEmp(Model m)
	{
		List<Employee> list=dao.getEmployees();
		m.addAttribute("list",list);
		return "ViewEmployee";
	}
	
	@RequestMapping(value="/editemp/{id}") // id=4
	public String edit(@PathVariable int id, Model m)
	{
		Employee emp=dao.getEmpById(id);
		
		// id=4, name=haritha,designation=wwww,salary=45454;
		
		m.addAttribute("command",emp);
		return "EditEmpForm";
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employee emp)
	{
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewemp";
	}
}
