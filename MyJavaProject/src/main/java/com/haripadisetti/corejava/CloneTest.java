package com.haripadisetti.corejava;


class Employee implements Cloneable {

	private int empNo;
	private String empName;

	Employee() {
	}

	Employee(int empNo, String empName) {

		this.empNo = empNo;
		this.empName = empName;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee(12, "Hari");
		System.out.println("Actual Employee:" + emp.getEmpNo() + "===" + emp.getEmpName());
		
		//Creating another reference for employee
		Employee emp2 = emp;
		emp2.setEmpNo(60);// updated with new reference
	
		System.out.println("Modified with new emp2 refeence:" +emp.getEmpNo() + "===" + emp.getEmpName());
		
		//for cloning emp Employee object.
		Employee emp3 = (Employee) emp.clone();
		emp3.setEmpNo(70);//update with after cloning object reference
		System.out.println("Cloned Employee:" + emp3.getEmpNo() + "===" + emp3.getEmpName());
		System.out.println("Actual Employee:" + emp.getEmpNo() + "===" + emp.getEmpName());

	}

}
