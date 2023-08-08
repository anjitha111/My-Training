package superconcepts;

public class ParentSuper {

	int a=100;
	int b=200;
	
	public void add()
	{
		int sum=a+b;
		System.out.println("Sum is " +sum);
		this.mult();//Calling another method in the same class
	}
	public void mult()
	{
		int mult=a*b;
		System.out.println("Product is " +mult);
	}
}
