package polymorphism;
import java.util.Scanner;
public class Case2poly {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Telephonebill t=new Telephonebill();
	//t.generatebill();
	Currentbill c=new Currentbill();
	//c.generatebill();
	System.out.println("Enter the telephone bill number");
	int n=s.nextInt();
	System.out.println("Enter the Customer name");
	String name=s.next();
	System.out.println("Enter the number of calls made");
	int nc=s.nextInt();
	System.out.println("Enter the cost per call");
	float cpc=s.nextFloat();
	System.out.println("Enter the Current bill number");
	int n1=s.nextInt();
	System.out.println("Enter the Customer name");
	String name1=s.next();
	System.out.println("Enter the number of units Consumed");
	int u=s.nextInt();
	System.out.println("Enter the cost per unit");
	float cpu=s.nextFloat();
	t.generatebill(n,name,nc,cpc);
	c.generatebill(n1,name1,u,cpu);


	}

}
