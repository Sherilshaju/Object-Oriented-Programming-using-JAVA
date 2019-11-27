package Abstract;

public class Student extends rank {
 void totalmark(String name,int id,String dept,int year,int m1,int m2,int m3,int m4,int m5) {
	 System.out.println("NAME ::"+name);
	 System.out.println("ROLLNO ::"+id);
	 System.out.println("DEPARTMENT ::"+dept);
	 System.out.println("YEAR ::"+year);
	 super.rank();

//void totalmark(String name,int id,String dept,int year,int m1, int m2, int m3, int m4, int m5) {
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

}
