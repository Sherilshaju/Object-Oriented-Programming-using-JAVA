package polymorphism;

public class Currentbill extends Bill {

	public void generatebill(int n1, String name1, int u, float cpu) {
		float amount2=u*cpu;
		System.out.println("Bill Number : "+n1);
		System.out.println("Customer name : "+name1);
		System.out.println("Current bill amount : "+amount2);
		
	}

	
}
