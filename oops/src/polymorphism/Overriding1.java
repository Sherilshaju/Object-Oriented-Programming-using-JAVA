package polymorphism;
import java.util.Scanner;
public class Overriding1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Abc obj1=new Abc();
	obj1.disp();
	Demo obj=new Demo();
	obj.disp();

	}

}
class Abc{

	public void disp() {
		System.out.println("Parent Class");		
	}
	
}
class Demo extends Abc{

	public void disp() {
		System.out.println("Child class");
		
	}
	
}
