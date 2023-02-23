package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmployeeDemo;
import com.example.demo.Repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired //extends another class
    EmployeeRepo emRepo; //reference variable
	
	public EmployeeDemo savedetails(EmployeeDemo s) {
		return emRepo.save(s);
	}
	public List <EmployeeDemo>getDetails()

{
		return emRepo.findAll();
		
}
	public EmployeeDemo updatedetails(EmployeeDemo st)
	{
		return emRepo.saveAndFlush(st);
	}
	
	
}
