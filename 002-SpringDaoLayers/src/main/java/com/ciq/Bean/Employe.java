 package com.ciq.Bean;

public class Employe {
private int Eid;
private String Ename;
private Double Esalary;
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public Employe(int eid, String ename, Double esalary) {
	super();
	Eid = eid;
	Ename = ename;
	Esalary = esalary;
}
public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public Double getEsalary() {
	return Esalary;
}
public void setEsalary(Double esalary) {
	Esalary = esalary;
}
@Override
public String toString() {
	return "Employe [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + "]";
}

}
