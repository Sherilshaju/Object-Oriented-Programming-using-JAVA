package Encapsulation;
import java.util.Scanner;
public class Encapcase1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Customer c=new Customer();
	Display d=new Display();
	System.out.println("Enter the name");
	c.setName(s.next());
	System.out.println("Enter the Address");
	c.setAddr(s.next());
	System.out.println("Enter the Contact number");
	c.setNum(s.next());
	System.out.println("Enter the Email");
	c.setEmail(s.next());
	System.out.println("Enter the Prooftype");
	c.setProoftype(s.next());
	System.out.println("Enter the Proofid");
	c.setProofid(s.next());
	d.display(c.getName(),c.getAddr(),c.getNum(),c.getEmail(),c.getProoftype(),c.getProofid());
	

	}

}
