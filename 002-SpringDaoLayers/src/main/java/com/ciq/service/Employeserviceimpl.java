package com.ciq.service;

import com.ciq.Bean.Employe;
import com.ciq.dao.Employedao;
import com.ciq.dao.Employedaoimpl;

public class Employeserviceimpl implements EmployeService, Employedao{
	
private Employedao employedao;
 
	public void setEmployedao(Employedao employedao) {
	this.employedao = employedao;
}

	public void save(Employe employe) {
		System.out.println("Employe service save method");
		employedao.save(employe);
		
	}

}
