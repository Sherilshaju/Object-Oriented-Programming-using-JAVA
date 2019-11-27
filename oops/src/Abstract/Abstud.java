package Abstract;
import java.util.Scanner;
public class Abstud {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the ID");
	int id=s.nextInt();
    System.out.println("Enter the Department");
    String dept=s.next();
    System.out.println("Enter the Year");
    int year=s.nextInt();
    System.out.println("Enter the Marks");
    int m1=s.nextInt();
    int m2=s.nextInt();
    int m3=s.nextInt();
    int m4=s.nextInt();
    int m5=s.nextInt();
    int t=0,rank;
    float avg;
	Student st=new Student();
	st.totalmark(name,id,dept,year,m1,m2,m3,m4,m5);
	}
	}


	