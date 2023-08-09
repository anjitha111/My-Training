package polymorphism;

public class Offseason {
	double discount=0.15;

	public void discount(float cost) {
		double cp=cost*discount;
		double price=cost-cp;
		System.out.println("Offseason clothes price is "+price);
		
	}

}
