package polymorphism;

public class ChildAddition extends ParentAddition{
	
	public void display(int a,int b)
	{
		int diff=a-b;
		System.out.println("Difference is "+diff);
		super.display(100, 20);
	}

	public static void main(String[] args) {
		ChildAddition ch=new ChildAddition();
		ch.display(100,20);

	}

}
