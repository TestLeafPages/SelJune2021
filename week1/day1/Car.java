package week1.day1;

//cntrl+F11 - to execute the program
public class Car {
	
// accessSpecifier dataType variableName = value	
	public String bodyColor = "Red";
	public int noOfWheels = 5;
	public long carPrice = 80000000000L;
	public float fuelCapcity = 30.5F;
	public double kmRan = 4324324.5654;
	public char fuelType = 'P';
	public boolean fullTankFuel = false;
			
	
	// accessSpecifier returnType methodName() ; methodName cntrl+space then enter
	public void driveCar() {
		int noOfDrivers = 2;
		System.out.println("drive car"); // syso cntrl+space
		System.out.println(noOfDrivers);
		System.out.println(bodyColor);
	}

	public void applyBrake() {
		System.out.println("applied brake");
		System.out.println(fuelCapcity);

	}

	// type main and cntrl+space then enter
	public static void main(String[] args) {
		// ClassName objectName = new ClassName()
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBrake();
		
		System.out.println(myCar.bodyColor);
		System.out.println(myCar.noOfWheels);
		

	}

}
