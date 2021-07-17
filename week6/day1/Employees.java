package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Employees {

	int empId;
	String empName;
	static String compName;

	public Employees() {
		System.out.println("default constructor");
	}

	Employees(int id, String name, String company) {
		System.out.println("Parameterized Constructor");
		empId = id;
		empName = name;
		compName = company;

	}
	
	public static void staticMethod() {
		System.out.println(" static method in Employees");
	}

	public static void main(String[] args) {

		Employees emp1 = new Employees(100, "Hari", "TestLeaf");

		Employees emp2 = new Employees(200, "Prasad", "TestLeaf Software Solutions");
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(compName);

		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(compName);

	}

}
