package week3.day1;

public class Vehicle {
	
	int carPrice = 534353;
	
	public void applyBrake() {
		System.out.println("applied brake");
	}
	
	public void soundHorn() {
		System.out.println("sound horn");
	}
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		
	}

		
}
