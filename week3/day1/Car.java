package week3.day1;

//F4
//			ChildClass   ParentClass
public class Car extends Vehicle{
	
	public void airCondition() {
		System.out.println("switch on air condition");

	}
	
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.applyBrake();
	}
	
	
	

}
