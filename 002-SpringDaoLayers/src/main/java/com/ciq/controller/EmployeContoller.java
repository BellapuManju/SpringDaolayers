package com.ciq.controller;

import com.ciq.Bean.Employe;
import com.ciq.service.EmployeService;
import com.ciq.service.Employeserviceimpl;

public class EmployeContoller {
	
	private EmployeService empoyeservice;
	
		
	
public void setEmpoyeservice(EmployeService empoyeservice) {
		this.empoyeservice = empoyeservice;
	}



public void save(Employe employe) {
	System.out.println("employe controller save method");
	empoyeservice.save(employe);

}}