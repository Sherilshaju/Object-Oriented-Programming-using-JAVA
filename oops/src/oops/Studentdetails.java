package oops;
import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	  System.out.println("Enter your name");
	     String name =s.nextLine();
	    
	    System.out.println("Rollno");
	    String rollno =s.nextLine();
	    System.out.println("Marks");
	    int m1=s.nextInt();
	    int m2=s.nextInt();
	    int m3=s.nextInt();
	    int m4=s.nextInt();
	    int m5=s.nextInt();
	    Student stud=new Student(name,rollno,m1,m2,m3,m4,m5);
	    stud.total();
	    stud.details();
	    stud.rank();
	    
	   }
}
class Student{
	String name;
	String rollno;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int total,avg,rank;
	public Student(String name,String rollno,int m1,int m2,int m3,int m4,int m5) {
		this.name=name;
		this.rollno=rollno;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	
	public void rank() {
		// TODO Auto-generated method stub
		if(avg>90&&avg<=100)
		{
			System.out.println("rank is 1");
		}
		else if(avg>80&&avg<=90)
		{
			System.out.println("rank is 2");
		}
		else if(avg>70&&avg<=80)
		{
			System.out.printf("rank is 3");
		}
		else if(avg>60&&avg<=70)
		{
			System.out.printf("rank is 4");
		}
		else
		{
			System.out.printf("rank is 5");
		}
		
	}
	
		
	

	public void total() {
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		//System.out.println("TOTAL "+this.total);
		//System.out.println("AVERAGE "+this.avg);
		
}
	public void details() {
		System.out.println("NAME "+this.name);
		System.out.println("ROLLNO "+this.rollno);
		System.out.println("MARK1 "+this.m1);
		System.out.println("MARK2 "+this.m2);
		System.out.println("MARK3 "+this.m3);
		System.out.println("MARK4 "+this.m4);
		System.out.println("MARK5 "+this.m5);
		System.out.println("TOTAL "+this.total);
		System.out.println("AVERAGE "+this.avg);
			
		
		
		
		
	}
	}
		
		
	
	
		
		
	
	
