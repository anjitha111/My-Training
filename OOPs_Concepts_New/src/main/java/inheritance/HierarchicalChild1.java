package inheritance;

public class HierarchicalChild1 extends HierarchicalParent{
		
		public void print1()
		{
			System.out.println("Welcome to the child class1 of hierarchical inheritance.");
		}

	public static void main(String[] args) 
	{
		
		HierarchicalChild1 child1=new HierarchicalChild1();
		child1.show();
		child1.print1();

	}

}
