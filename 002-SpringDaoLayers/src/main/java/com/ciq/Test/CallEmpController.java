package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Bean.Employe;
import com.ciq.controller.EmployeContoller;

public class CallEmpController {
public static void main(String[] args) {
	
	Employe em1=new Employe(1,"manju", 23456.88);

	ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
	EmployeContoller em=(EmployeContoller) con.getBean("controller"); 
	 em.save(em1);
//System.out.println(em);			
	 
	
}
}
