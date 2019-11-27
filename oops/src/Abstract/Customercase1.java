package Abstract;
import java.util.Scanner;
public class Customercase1 {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Registration");
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the Address");
	String addr=s.next();
    System.out.println("Enter the Contact number");
    int cnum=s.nextInt();
    System.out.println("Enter the email");
    String email=s.next();
    System.out.println("Enter the prooftype");
    String pt=s.next();
    System.out.println("Enter the proofID");
    String pid=s.next();
    Customernew c=new Customernew();
    c.display(name,addr,cnum,email,pt,pid);
    c.updateemail(name,addr,cnum,email,pt,pid);
	}
}
  
    interface details1
    {
    	public void display(String name,String addr,int cnum,String email,String pt,String pid);
    	
    }
    interface update{
    	public void updateemail(String name,String addr,int cnum,String email,String pt,String pid);
    	
    }
    
    class Customernew implements details1,update{
    	public void display(String name,String addr,int cnum,String email,String pt,String pid) {
    		Scanner s=new Scanner(System.in);
    		int i=0;
    		System.out.println("NAME ::"+name);
    		 System.out.println("ADDRESS ::"+addr);
    		 System.out.println("CONTACT NUMBER ::"+cnum);
    		 System.out.println("EMAIL ::"+email);
    		 System.out.println("PROOF TYPE ::"+pt);
    		 System.out.println("PROOF ID ::"+pid);
    		 System.out.println("Thankyou for registering.Your id is"+i);
    	}
    public void updateemail(String name,String addr,int cnum,String email,String pt,String pid) {
    	Scanner s=new Scanner(System.in);
    
    		 System.out.println("Do u want to Continue registration(y/n)");
    		 String pr=s.next();
    		 if(pr.equals("n")==true||pr.equals("y")==true)
    		 {
    			 System.out.println("Do u want to Update the email id?(y/n)");	
    			 String z=s.next();
    			 if(z.equals("y")==true)
{
    				 System.out.println(" Update the email ");	
    				 System.out.println("Enter  the new  email id");
    				 String email2=s.next();
    				 email=email2;
    				 System.out.println("Email Updated");	
    			 }
    			 System.out.println("your Details are as Follows:");
    			 System.out.println("NAME ::"+name);
        		 System.out.println("ADDRESS ::"+addr);
        		 System.out.println("CONTACT NUMBER ::"+cnum);
        		 System.out.println("EMAIL ::"+email);
        		 System.out.println("PROOF TYPE ::"+pt);
        		 System.out.println("PROOF ID ::"+pid);
    		 
    	}
    	
    
	

	}

}
