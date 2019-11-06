package oops;
//import java.sql.Date;
import java.util.Scanner;
public class Project1 {
static int id=10;
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[] name=new String[25];
	String[] email=new String[25];
	int i= 1;
	String op1;
	String op2;
	
	do
	{
	System.out.println("Registration");
    System.out.println("Enter your name");
    name[i] =s.next();
    System.out.println("Enter your address");
    String address =s.next();
    System.out.println("Contact Number");
    String contactnumber =s.next();
    System.out.println("E-Mail ID");
    email[i]=s.next();
    System.out.println("Enter proof type");
    String prooftype =s.next();
    System.out.println("Enter proof id");
    String proofid =s.next();
	System.out.println("Thank you for registering. Your id is"+id);	
	id++;
	i++;
	Details obj=new Details(name,address,contactnumber,email,prooftype,proofid);
    System.out.println(" Do you want to book a room (y/n)");
    op1=s.next();
	if(op1.equals("yes")==true)
	{
		obj.booking();	
	}
i++;
	System.out.println("Do you want to continue registration(yes/no)");
	 op2=s.next();
	}
	while(op2.equals("yes")==true);
	i++;
	System.out.println("View all Bookings");
	System.out.println("Enter the Start date:");
	int date1=s.nextInt();
	System.out.println("Enter the End date:");
	int date2=s.nextInt();
System.out.println("The bookings from "+date1+" to "+date2);
	System.out.println("Customer ID  Customer name   Email");
	for(int k=1;k<i;k++)
	{
		System.out.println(k+"                "+ name[k] +"             "+ email[k] );	
		
	}

	}
} 
class Details{
	int i;
	Scanner s= new Scanner(System.in);
	String[] name=new String[25];
	String[] email=new String[25];
	String address,contactnumber,prooftype,proofid;
	public Details(String[] name, String address, String contactnumber, String[] email, String prooftype,
			String proofid) {
		this.address=address;
		this.contactnumber=contactnumber;
		this.prooftype=prooftype;
		this.proofid=proofid;
	}
	


void booking() {
	String ac,a;
    String cot;
    String cable;
    String wifi;
    String laundry;
    Scanner s=new Scanner(System.in);
    int total=0,b=0,c,d,e,f,i=1;
    System.out.println("Booking:");
    System.out.println("Please choose the service required");
    System.out.println("AC/Non-AC(AC/nAC)");
    ac=s.next();
    if(ac.contentEquals("AC")==true)
    {
    b=1500;
    }
    else
    {
    b=700;
    }
    System.out.println("Cot(Single/Double)");
    cot=s.next();
    if(cot.contentEquals("Single")==true)
    {
    c=50;
    }
    else
    {
    c=100;
    }
    System.out.println("With cable connection/without cable connection(C/nC)");
    cable=s.next();
    if(cable.contentEquals("C")==true)
    {
    d=50;
    }
    else
    {
    d=0;
    }
    System.out.println("Wi-Fi needed or not(W/nW)");
    wifi=s.next();
    if(wifi.contentEquals("W")==true)
    {
    e=200;
    }
    else
    {
    e=0;
    }
    System.out.println("Laundry service needed or not(L/nL)");
    laundry=s.next();
    if(laundry.contentEquals("L")==true)
    {
    f=100;
    }
    else
    {
    f=0;
    }
    total=b+c+d+e+f;
    System.out.println("The total charge RS."+total);
    System.out.println("The services chosen are");
    if(b==1500)
    {
    System.out.println("AC");
    }
    else
    {
    	System.out.println("Non AC");
    }
    if(c==50)
    {
    System.out.println("Single");
    }
    else
    {
    	System.out.println("Double");
    }
    if(d==50)
    {
    System.out.println("With cable");
    }
    else
    {
    	System.out.println("Without Cable");
    }
    if(e==200)
    {
    System.out.println("With wifi");
    }
    else
    {
    	System.out.println("Without wifi");
    }
    if(f==100)
    {
    System.out.println("With laundry Service");
    }
    else
    {
    	System.out.println("Without laundry Service");
    }
    System.out.println("Do u want to proceed");
     a = s.next();
    while(a.equals("no"));
    if(a.equals("yes")==true)
    {
    	System.out.println("Thankyou your number is "+i);
    	i=i+1;
    }
    i=i+1;
}

}