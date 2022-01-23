package org.datatypes;
public class Student {
	private void studentId() {
		//datatype variablename = value;
		
		byte age =12;
		short salary = 10000;
		int accountNo = 36547891;
		long phonenumber = 9788165991l;
		System.out.println("byte age is :"+age);
		System.out.println("Short salary is :"+salary);
		System.out.println("int Accountnumber is :"+accountNo);
		System.out.println("Long phonenumber is :"+phonenumber);
	
	//Floating point = store decimal numbers
	float percentage = 84.44498654f;
	double d = 67.987654656;
	System.out.println("Float percentage is :"+percentage+"\n"+"double d is :"+d+"\n");
	//char=store single letter or single number
	char initial = 'M';
	//boolean = store true or false
	boolean b= true;
	System.out.println("Char Initial is :"+initial+"\n"+"Boolean b is :"+d+"\n");
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentId();
	}
}
