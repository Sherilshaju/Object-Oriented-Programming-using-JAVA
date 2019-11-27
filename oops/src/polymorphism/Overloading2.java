package polymorphism;
import java.util.Scanner;
public class Overloading2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        Student st=new Student();
        System.out.println("Enter the name");
        String name=s.next();
        System.out.println("Enter the Rollno");
        String rollno=s.next();
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
        st.details(name,rollno,dept,year);
        st.details(m1,m2,m3,m4,m5);
        
       
        
        
        
	}

}
