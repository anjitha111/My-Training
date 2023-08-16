package abstractclass;

public class AbstractChild extends Abstract1{

	public static void main(String[] args) {
		/*AbstractChild ch=new AbstractChild();
		ch.display();
		ch.show();*/
		AbstractChild ch1=new AbstractChild(10,20);
	}
	public AbstractChild(int a,int b)
	{
		super(100,200);//Calling parametrised constructor of parent class from child class.
		int c=a+b;
		System.out.println("Sum in child class constructor is "+c);
	}
	
	AbstractChild()
	{
		System.out.println("This is a child class constructor.");
	}

	@Override //Annotation-Parent class contains this method.
	public void display() {
		
		System.out.println("Parent abstract method definition.");
	}

}
