package com.springvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springvalidation.enity.Data;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/springform")
	public String formpage(Model m)
	{
		System.out.println("Form page");
		m.addAttribute("data", new Data());
		return "form";
	}
	// handler for process form
	@PostMapping("/process")
	public String process(@Valid @ModelAttribute("data") Data data, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		System.out.println(data);
		return "success";
	}
}