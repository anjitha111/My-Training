package polymorphism;

public class ChildOverride extends ParentOverride {

	public void print()
	{
		System.out.println("Child class method");
		super.print();//Will call parent class method.It will execute first if it is given first here.It will get stored in a separate memory.
	}
	public static void main(String[] args) {
		ChildOverride child=new ChildOverride();
		child.print();//It will override parent class method and will print child class method content only.
	}

}
