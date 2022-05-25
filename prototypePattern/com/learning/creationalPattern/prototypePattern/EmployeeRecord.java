package com.learning.creationalPattern.prototypePattern;

public class EmployeeRecord implements Cloneable{
	private int eid;
	private String name;
	private String designation;
	private double salary;
	public String address;
	
	public EmployeeRecord() {
		super();
	}

	public EmployeeRecord(int eid, String name, String designation, double salary, String address) {
		this();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	
	public Object getClone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void showRecord() {
		System.out.println(eid+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
	}
 	
}
