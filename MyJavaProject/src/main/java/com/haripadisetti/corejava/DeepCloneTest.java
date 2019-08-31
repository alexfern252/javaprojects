package com.haripadisetti.corejava;


class Employee2 implements Cloneable {

	private int empNo;
	private String empName;
	private Address address;

	Employee2() {
	}

	Employee2(int empNo, String empName ,Address address) {

		this.empNo = empNo;
		this.empName = empName;
		this.address = new Address(address.getLocation(),address.getPlotNo()); 
		//creating new address object of mutable object to achieve deep copy
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}


class Address {
	
	private String location;
	private String plotNo;
	
	Address(String location,String plotNo){
		this.location = location;
		this.plotNo = plotNo;
	}
	
/*	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	*/
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	
}

public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("hyd","navya141");
		
		Employee2 emp = new Employee2(1,"Hari",address);
		
		Employee2 emp2 = (Employee2) emp.clone(); //cloned on Empployee and Address
		// below two statements , we come to know that emp is cloned  and addreess is not deep cloned.
		// because if we change propery in address object and it is getting reflected in cloned object
		
		////creating new address object of mutable object to achieve deep copy
		//in  employee2 contructor
		emp.setEmpNo(2);
		address.setLocation("Ameen"); // 
		
		System.out.println("emp no=" + emp2.getEmpNo() + "\n" + "emp name=" + emp2.getEmpName());
		System.out.println("Address=" + emp2.getAddress().getLocation() +"," + emp2.getAddress().getPlotNo());
		
	}
}
