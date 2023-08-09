package polymorphism;

import java.util.Scanner;

public class Onseason extends Offseason {
	double discount=0.4;
	public void discount(float cost)
	{
		double cp=cost*discount;
		double price=cost-cp;
		System.out.println("Onseason clothes price is "+price);
		super.discount(cost);
	}
	{
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost of clothes.");
		float cost=sc.nextFloat();
		Onseason on=new Onseason();
		on.discount(cost);
		
		
	}

}
