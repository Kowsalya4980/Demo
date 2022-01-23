package com.hierachical;

public class CompanyOwner extends Employee  {   //child class 
	private void companyOwnerName() {
		System.out.println("Company owner name is : Yuvaraj");

	}
	public static void main(String[] args) {
		CompanyOwner co = new CompanyOwner();
		co.companyOwnerName();
		co.employeename();
	}
}
