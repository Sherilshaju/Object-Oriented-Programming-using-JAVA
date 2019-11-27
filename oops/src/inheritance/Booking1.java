package inheritance;

//import java.util.Scanner;

public class Booking1 {
	//Scanner s=new Scanner(System.in);
	public void tariff(int persons,int days,int t,int diss) {
		int sum=persons*days*t;
		//int temp=dis/100;
		
				int x=diss/100;
				int tariff=sum*x;
		//int ta=sum-tariff;
		System.out.printf("Total tariff::%d",tariff);
	}
	public void tariff1(int persons,int days, int t,int pc) {
	int ss=persons*days*t*pc;
		
		
		System.out.println("Total tariff::"+ss+"/-");
	}
	
}

