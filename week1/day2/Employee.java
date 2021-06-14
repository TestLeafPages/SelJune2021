package week1.day2;

public class Employee {
	
	
	public void printEmployeeDetails(String firstName, int empId) {
		System.out.println("Details of "+firstName+" "+empId);

	}
	
	public String getEmployeeAddress() {
		
		return "Chennai";
	}
	

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.printEmployeeDetails("Hari",100);
		
		
		
		String address = emp1.getEmployeeAddress();
		
		System.out.println(address);
		
		
		
		
		
		

	}

}
