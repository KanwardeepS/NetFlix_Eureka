package com.microservice.eureka.model;


public class Employee {
	private String empId;
	private String name;
	private String designation;
	private double salary;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName( final String name ) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation( final String designation ) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary( final double salary ) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId( final String empId ) {
		this.empId = empId;
	}

}