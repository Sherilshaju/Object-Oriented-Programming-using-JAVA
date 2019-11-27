package Encapsulation;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Student st=new Student();
    System.out.println("Enter the name");
    st.setName(s.next());
    System.out.println("Enter the ID");
    st.setId(s.nextInt());
    System.out.println("Student Details:");
    System.out.println("name  "+st.getName());
    System.out.println("ID  "+st.getId());
	}

}
