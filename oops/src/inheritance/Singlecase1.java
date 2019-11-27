package inheritance;
import java.util.Scanner;
public class Singlecase1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double total=0;
	System.out.println("Enter the number of persons");
	int persons=s.nextInt();
	System.out.println("Enter the total number of days");
	int days=s.nextInt();
	System.out.println("Tariff per day ");
	double t=s.nextInt();
	System.out.println("Enter the Room type");
	String type=s.next();
	Seasonbooking b=new Seasonbooking();
	b.book(type,total);
	b.roombooking(t,days,persons);
	
	

	}

}
