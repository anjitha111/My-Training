package abstractclass;

public abstract class Abstract1 {
	
	public abstract void display();//We cannot give body for abstract methods
	
	public void show()
	{
		System.out.println("Non abstract method in parent class.");
	}
	
	Abstract1()
	{
		System.out.println("Default constructor in parent class.");
	}
	public Abstract1(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	

}
