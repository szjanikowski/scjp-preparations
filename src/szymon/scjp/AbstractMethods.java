package szymon.scjp;

abstract class Vehicle {
	private int numberOfWheels;
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	abstract void go();
	
}

abstract class Car extends Vehicle {
	abstract void go(int distance);
	abstract void go();
	
	
	private int engineSize;
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public int getEngineSize() {
		return engineSize;
	}

}

class Mini extends Car {

	@Override
	void go(int distance) {
		System.out.println("Showing distance");
		
	}

	@Override
	void go() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractMethods {
	public static void main (String[] args) {
		
	}
}
