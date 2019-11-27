package Interface;

import java.util.Scanner;

public class Interface1 {

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
	    int t=0;
	    float avg;
		Studentnew st=new Studentnew();
		st.display(name,id,dept,year);
		st.totalmark(m1,m2,m3,m4,m5);
		}
		}
interface details{
	public void display(String name,int id,String dept,int year);
}
interface total{
	public void totalmark(int m1,int m2,int m3,int m4,int m5);
}
class Studentnew implements details,total{
	
	//public void details(String name,int id,String dept,int year)
	
	
	//public void total(int m1, int m2, int m3, int m4, int m5) {
		

	@Override
	public void totalmark(int m1, int m2, int m3, int m4, int m5) {
		// TODO Auto-generated method stub
		int t=m1+m2+m3+m4+m5;
		 System.out.println("TOTAL MARKS ::"+t);
		 float avg=t/5;
			
			System.out.println("AVERAGE ::"+avg);
			if(t>450 && t<=500)
			{
				System.out.println("RANK 1");	
			}
			else if(t>400 && t<=450)
			{
				System.out.println("RANK 2");	
			}

			else if(t>350 && t<=400)
			{
				System.out.println("RANK 3");	
			}

			else if(t>300 && t<=350)
			{
				System.out.println("RANK 4");	
			}

			else
			{
				System.out.println("FAILED");	
			}

	}
	
		
	

	@Override
	public void display(String name, int id, String dept, int year) {
		// TODO Auto-generated method stub
		{
			System.out.println("NAME ::"+name);
			 System.out.println("ROLLNO ::"+id);
			 System.out.println("DEPARTMENT ::"+dept);
			 System.out.println("YEAR ::"+year);
		}
	}
}

	


