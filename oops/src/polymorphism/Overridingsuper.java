package polymorphism;

import java.util.Scanner;

public class Overridingsuper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Xyz obj=new Xyz();
		obj.disp();

		}

	}
	
	class Xyz extends Mno{
      public void disp() {
			super.disp();
			System.out.println("Child class");
			
		}

	}
	class Mno{

		public void disp() {
			System.out.println("Parent Class");		
		}
		
	}


