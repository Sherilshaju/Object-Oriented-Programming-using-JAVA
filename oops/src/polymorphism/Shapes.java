package polymorphism;

public class Shapes {

	public void area(int side) {
		int a=side*side;
		System.out.println("area of square is "+a);
		
	}

	public void area(int l, int b) {
	int a=l*b;
	System.out.println("area of Rectangle is "+a);	
	}
	 
	
}
