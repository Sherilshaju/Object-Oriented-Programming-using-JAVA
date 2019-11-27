package Encapsulation;
import java.util.Scanner;

public class Casestudy4 {
    
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int i=1,k=1;
    Ticket1 obj=new Ticket1();
	System.out.println("Enter Price of a ticket :");
	obj.setPrice(s.nextInt());
	System.out.println("Enter Number of Persons :");
	obj.setP(s.nextInt());
	int a=obj.getP();
	String Name[]=new String[25];
	String Gender[]=new String[10];
	int Age[]=new int[5];
	int x=a;
	int j;
	
	for(j=0;j<a;j++)
	{
	System.out.printf("Enter Details for Person %d :\n",i);
	i++;
	System.out.println("Name:");
	obj.setName(s.next());
	String na=obj.getName();
	Name[j]=na;
	System.out.println("Gender (M or F) :");
	obj.setGender(s.next());
	String df=obj.getGender();
	Gender[j]=df;
	System.out.println("Age :");
	obj.setAge(s.nextInt());
	int gen=obj.getAge();
	Age[j]=gen;
	
	}

    obj.ticket(obj.getP(),obj.getPrice());
	while(k<=obj.getP())
	{

	double total=obj.ticket1(obj.getAge(),obj.getGender(),obj.getP(),obj.getPrice());

	if(k==obj.getP()) {

	System.out.printf("TOTAL AMOUNT=%.1f",total);
	break;
	}
	k++;
	}
	System.out.printf("enter the details\n");
	int q=1;
	for(i=0;i<x;i++)
	{
		System.out.printf("%d)%s(%s %d)\n",q,Name[i],Gender[i],Age[i]);
		q++;
	}
	}

}
