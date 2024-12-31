package vehicle;

import java.io.PrintWriter;

public class Vehicle {
	private String name;
	private int currentSpeed;
	
	public Vehicle(String name) {
		this.setName(name);
		this.setCurrentSpeed(0);
	}
	
	public void move(int currentSpeed) {
		this.setCurrentSpeed(currentSpeed);
		System.out.println("Moving at "+ currentSpeed+" Speed");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public void stop() {
		this.setCurrentSpeed(0);
		System.out.println("Stopped");
	}
}
