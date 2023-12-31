package com.mongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongo.models.Form;
import com.mongo.repositories.FormRepository;

@Controller
public class HomeController {
	
	@Autowired
	private FormRepository formRepository;
	
	
	@GetMapping("/form")
	public String login() 
	{
		return "form";
	}
	
	@ResponseBody
	@PostMapping("/submit")
	public String submit(@ModelAttribute("form") Form form) 
	{
		System.out.println(form);
		if (form !=null) 
		{
			formRepository.save(form);
			return "Form Submitted Successfully";			
		}
		
		return "There Is An Error Submitting The Form";
		
	}

}