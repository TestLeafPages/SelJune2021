package week3.day1;

public class EmployeeInfo {
	
	
	public void findEmpDetails(String empName) {
		System.out.println(empName+" details");

	}
	
	public void findEmpDetails(int empId) {
		System.out.println(empId+" details");

	}
	
	public void findEmpDetails(String empName, int empId) {
		System.out.println(empName+" "+empId+" details");

	}
	
	  public void findEmpDetails(int phno, String email) {
	  System.out.println(phno+" "+email+" details");
	  
	  }
	 
	
	
	

	public static void main(String[] args) {
		
		
		  EmployeeInfo ei = new EmployeeInfo(); 
		  ei.findEmpDetails(454353,"test@gmail.com");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
