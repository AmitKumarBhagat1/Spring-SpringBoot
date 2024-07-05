package com.thymeleaf.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.Model;

@Controller
public class MyController {

	 @RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("Inside About");
		model.addAttribute("name","Amit Chaurasiya...");
		model.addAttribute("date",new Date());
		return "about";
	}
	 
	 //handling Iteration
	 @GetMapping("/looping")
	 public String iteration(Model m)
	 {
		 //Starded from java versin 9
		 List<String> names = List.of("Amit","Rahul","Ram","Radhe");
		 Model attribute = m.addAttribute("names", names);
		 return "iteration";
	 }
	 //handling Conditional operator
	 @GetMapping("/conditional")
	 public String conditionalHandler(Model m)
	 {
		 m.addAttribute("isActive", false);
		 m.addAttribute("gender", "f");
		 List<Integer> of = List.of(12,15,56,93);
		 m.addAttribute("mylist", of);
		 return "conditional";
	 }
	 
	 //handling footer fragments
	 @GetMapping("/service")
	 public String  serviceHandler(Model m)
	 {
		 m.addAttribute("tittle", "I am from Bihar");
		 m.addAttribute("subtittle",LocalDateTime.now().toString());
		 return "service";
	 }
	 //handling Inheritance concept (In themeleaf it is possible by fragment only)
	 @GetMapping("/newabout")
	 public String newAbout()
	 {
		 return "aboutnew";
	 }
	 
	 @GetMapping("/contact")
	 public String contact()
	 {
		 return "contact";
	 }
	 
	 
	 
	 
	 
	 
}
