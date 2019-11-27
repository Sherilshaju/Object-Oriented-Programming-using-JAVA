package polymorphism;
import java.util.Scanner;
public class Poly1 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Addmethodoveloading a=new Addmethodoveloading();
    int n1=s.nextInt();
    int n2=s.nextInt();
    int n3=s.nextInt();
    a.add(n1);
    a.add(n1,n2);
    a.add(n1,n2,n3);

	}
	

}
