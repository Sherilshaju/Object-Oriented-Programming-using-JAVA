package polymorphism;

import java.util.Scanner;

public class Car extends Vehicle {
	Scanner s=new Scanner(System.in);

	public void displayDetails() {
		System.out.println("Enter the details of bike");
		System.out.println("Enter the colour");
		String colour=s.next();
		System.out.println("Enter the maximum speed");
		int speed=s.nextInt();
		System.out.println("Enter the number of seats");
		int seats=s.nextInt();
		System.out.println("Enter the number of wheels");
		int w=s.nextInt();
		System.out.println("Enter the number of doors");
		int door=s.nextInt();
		System.out.println("Enter the status of AC(true/false)");
		String stat=s.next();
		//super.displayDetails();
		System.out.println("Car Details");
		System.out.println("Colour ::"+colour);
		System.out.println("Maximum speed"+speed);
		System.out.println("No. of Seats"+seats);
		System.out.println("No. of Wheels"+w);
		System.out.println("No. of Doors"+door);
		System.out.println("status of diskbreak"+stat);
	}

}
