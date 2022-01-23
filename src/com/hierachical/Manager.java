package com.hierachical;

public class Manager extends Employee {     //child class
	private void managerName() {
		System.out.println("Manager name is : Barath");

	}
	public static void main(String[] args) {
		Manager ma = new Manager();
		ma.managerName();

	}

}
