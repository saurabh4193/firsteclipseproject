package com.employee;

public class Employee {
	private int empid;
	private String empname;
	private String empcode;

	public Employee(int empid, String empname, String empcode) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcode = empcode;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empcode=" + empcode + "]";
	}

	@Override
	public boolean equals(Object obj) {

		Employee e = (Employee) obj;
		return this.empid == e.getEmpid();
	}

}
