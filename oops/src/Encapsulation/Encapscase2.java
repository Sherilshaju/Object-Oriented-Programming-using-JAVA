package Encapsulation;
import java.util.Scanner;
public class Encapscase2 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Customer1 c1=new Customer1();
	System.out.println("Enter the name");
	boolean b1=c1.setName(s.next());
	System.out.println("Enter the Address");
	boolean b2=c1.setAddr(s.next());
	System.out.println("Enter the Contact number");
	boolean b3=c1.setNum(s.next());
	System.out.println("Enter the Email");
	boolean b4=c1.setEmail(s.next());
	System.out.println("Enter the Prooftype");
	boolean b5=c1.setProoftype(s.next());
	System.out.println("Enter the Proofid");
	boolean b6=c1.setProofid(s.next());
	//c1.display(c1.getName(),c1.getAddr(),c1.getNum(),c1.getEmail(),c1.getProoftype(),c1.getProofid());
	c1.check(b1,b2,b3,b4,b5,b6);
	}

}
