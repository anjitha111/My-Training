package superconcepts;

public class ChildSuper extends ParentSuper {

	int a=10;
	int b=20;
	
	void print()
	{
		System.out.println("Value of a and b are " +a +" " +b);
		System.out.println("Value of a and b in parent class are " +super.a+ " and " +super.b);//Printing parent class variables using super keyword.
		super.add();//Calling parent method from child class
		this.subtraction();//To call the same class method.If this() is not used,sometimes it may throw some error.

		
	}
	void subtraction()
	{
		int difference=b-a;
		System.out.println("Difference is "+difference);
	}
	public static void main(String args[])
	{
		ChildSuper ch=new ChildSuper();
		//ch.add();
		ch.print();
	}

}
