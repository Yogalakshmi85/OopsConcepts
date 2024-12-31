package vehicle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter rate to know the gear no:");
		Scanner scanner=new Scanner(System.in);
		int rate=scanner.nextInt();
		scanner.nextLine();
		int doors=5, wheels=4;
		System.out.println("Enter the type of the car:");
		String type=scanner.nextLine();
		BMW bmw=new BMW("BMW",type);
		bmw.details();
		bmw.acceleration(rate);	}

}
