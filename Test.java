package com.anpc8323.day3;
//Accessing non static variables in another class.
class Employee
{
	int id = 101;
	String name = "Tom";
	double salary = 3000;
}
public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);

	}

}
