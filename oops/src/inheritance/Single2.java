package inheritance;
import java.util.Scanner;
public class Single2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the colour");
	String c=s.next();
	Colour d=new Colour();
	d.model(c);
	d.cost(c);

	}

}
