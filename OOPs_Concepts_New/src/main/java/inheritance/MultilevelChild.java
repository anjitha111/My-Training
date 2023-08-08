package inheritance;

public class MultilevelChild extends MultilevelIntermediate {
	public void show()
	{
		System.out.println("This is the child class");
	}
	public static void main(String[] args) {
		
		MultilevelChild child=new MultilevelChild();
		
		child.print();
		child.display();
		child.show();

	}

}
