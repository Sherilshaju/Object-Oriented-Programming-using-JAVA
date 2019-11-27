package polymorphism;
import java.util.Scanner;
public class Overloading3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Shapes sh=new Shapes();
	System.out.println("Enter the side of the square");
	int side=s.nextInt();
	System.out.println("Enter the length and breadth of the Rectangle");
	int l=s.nextInt();
	int b=s.nextInt();
	int a;
	sh.area(side);
	sh.area(l,b);
	
	
			
			
			

	}

}
