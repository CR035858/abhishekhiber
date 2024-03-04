package com.gl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="eno")
	private int eno;
	@Column(name="name")
	private String name;
	@Column(name="sal")
	private double sal;
	//private Address permAddress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eno, String name, double sal/*, Address permAddress*/) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
		//this.permAddress = permAddress;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	/*public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}*/
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", sal=" + sal + /*", permAddress=" + permAddress +*/ "]";
	}

	
	

}
