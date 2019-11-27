package inheritance;
import java.util.Scanner;
public class Single1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the speed");
	int a=s.nextInt();
	Toyota d=new Toyota();
	d.name();
	d.about();
	d.Speed(a);
	
	}

}
