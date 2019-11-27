package polymorphism;

public class Telephonebill extends Bill {

	public void generatebill(int n, String name, int nc, float cpc) {
		float amount1=nc*cpc;
		System.out.println("Bill Number : "+n);
		System.out.println("Customer name : "+name);
		System.out.println("Telephone bill amount : "+amount1);
		
	}

	
}
