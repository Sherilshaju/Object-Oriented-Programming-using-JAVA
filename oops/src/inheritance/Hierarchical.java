package inheritance;
import java.util.Scanner;
public class Hierarchical {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the fruit");
	String c=s.next();
	System.out.println("enter the quantity in kg");
	String k=s.next();
	Mango f=new Mango();
	f.available();
	f.costmango(k);
	f.costorange(k);

	if(c.equals("mango"))
	{
		f.costmango(k);
	}
	else
	{
		f.costorange(k);
	}
	
	
	}

}
