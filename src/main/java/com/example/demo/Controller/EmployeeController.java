package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmployeeDemo;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired //extends another class
         EmployeeService empService;
	
	@PostMapping("/addDetails")
	
	public EmployeeDemo addInfo(@RequestBody EmployeeDemo em) {
		return empService.savedetails(em);
	}
	@GetMapping("/showDetails")
	public List<EmployeeDemo>fetchDetails()
	{
		return empService.getDetails();
	}
	}
