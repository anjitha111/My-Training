package inheritance;

public class ChildSingleInheritance extends ParentSingleInheritance{
	
	public void show()
	{
		System.out.println("Single Inheritance-Child class");
	}

	public static void main(String[] args) {
		
		ChildSingleInheritance ch=new ChildSingleInheritance();
		ch.display();
		ch.show();
		

	}

}
