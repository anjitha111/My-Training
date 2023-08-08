package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
		
		public void print2()
		{
			System.out.println("Welcome to the child class2 of hierarchical inheritance.");
		}

	public static void main(String[] args) 
	{
		
		HierarchicalChild2 child2=new HierarchicalChild2();
		
		child2.show();
		child2.print2();

	}

}
