package inheritance;
import java.util.Scanner;
public class Multilevel1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("welcome");
	System.out.println("Enter the car");
	String p=s.next();
	
		Model m=new Model();
	    m.colour(p);
	    m.speed();
	    m.exit();

	}

}
