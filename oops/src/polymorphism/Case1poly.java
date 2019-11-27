package polymorphism;
import java.util.Scanner;
public class Case1poly {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Bike b=new Bike();
	//b.displayDetails();
   Car c=new Car();
    //c.displayDetails();
    System.out.println("1.Bike\n2.Car");
    int ch=s.nextInt();
    switch(ch)
    {
    case 1: 	
		b.displayDetails();
		break;
    case 2:
		c.displayDetails();
		break;
	default:
			System.out.println("Invalid input");
    	
    }
    
	}

}
