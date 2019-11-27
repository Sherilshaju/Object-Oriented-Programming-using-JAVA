package inheritance;
import java.util.Scanner;
public class Hierarchicalcase {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of persons");
	int persons=s.nextInt();
	System.out.println("Enter the total number of days");
	int days=s.nextInt();
	System.out.println("Tariff per day ");
	int t=s.nextInt();
	System.out.println("Enter the Room type");
	String type=s.next();
	System.out.println("Enter the month");
	int m=s.nextInt();
	
	Peakseason obj1=new Peakseason();
	Leanseason obj2=new Leanseason();
	
	if(m==4||m==5||m==6||m==9||m==11||m==12)
	{
		System.out.println("Enter the peakcharge");
		int pc=s.nextInt();
		obj1.tariff1(persons,days,pc,t);
	}
	
	else
	{
		System.out.println("Enter the Discount");
		int diss=s.nextInt();
		obj2.tariff(persons,days,t,diss);	
	}
	}

}
