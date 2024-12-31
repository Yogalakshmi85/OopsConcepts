package vehicle;

public class Car extends Vehicle{
	private String type;
	private int gears;
	private int currentGear;
	private int wheels;
	private int doors;
	
	public Car(String name, int gears, int doors, String type, int wheels) {
		super(name);
		this.type=type;
		this.wheels=wheels;
		this.doors=doors;
		this.currentGear=1;
		this.gears=gears;
	}
	public void details() {
		System.out.println("Car details: ");
		System.out.println("Name: "+getName()+"\nType: "+type+"\nWheels: "+wheels+"\nDoors: "+doors);
	}
	public void changeGear(int newGear) {
		this.currentGear=newGear;
		System.out.println("The car changed to the gear "+currentGear);
	}
}
