package superconcepts;

public class ChildConstructor extends ParentConstructor {
	ChildConstructor()
	{
		super(10);
		System.out.println("Child class default constructor");
		
	}

	public static void main(String[] args) {
	
		ChildConstructor child=new ChildConstructor();//Will call parent class default constructor implicitly.


	}

}
