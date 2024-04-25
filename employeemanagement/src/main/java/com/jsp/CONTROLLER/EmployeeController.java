package com.jsp.CONTROLLER;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDAO;
import com.jsp.DTO.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/add")
	public ModelAndView saveEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("addemp.jsp");
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		dao.saveEmp(employee);
		ModelAndView view=new ModelAndView();
		view.setViewName("index.jsp");
		return view;
				}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("getEmp.jsp");
		return mv;
	}
	
	@RequestMapping("/getemp")
	public ModelAndView getEmployee(@ModelAttribute Employee employee) {
		
		 Employee emp=dao.getEmp(employee);
		ModelAndView mv =new ModelAndView();
		mv.addObject("emp", emp);
		mv.setViewName("empDetails.jsp");
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("deleteEmp.jsp");
		return mv;
	}
	@RequestMapping("/remove")
	public ModelAndView removeEmployee(@ModelAttribute Employee employee) {
		ModelAndView view=new ModelAndView();
		System.out.println(dao.deleteEmp(employee));
		view.setViewName("index.jsp");
		return view;
	}
	

	@RequestMapping("/updateDesignation")
	public ModelAndView updateSalary() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("updateDesignation.jsp");
		return mv;
	}
	@RequestMapping("/setDesignation")
	public ModelAndView setSalary(@ModelAttribute Employee employee) {
		ModelAndView mv=new ModelAndView();
		System.out.println(dao.updateEmployee(employee));
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/viewAll")
	public ModelAndView viewAll() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("empList", dao.viewAllEmployee());
		mv.setViewName("viewAllEmp.jsp");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
