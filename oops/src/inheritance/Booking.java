package inheritance;

public class Booking {
	public void book(String type,double total) {
		if(type.equals("AC"))
		{
			total=total+100;
		}
		else
		{
			total=total;
		}
		
		System.out.println("Total tariff::");
		
	}

}
