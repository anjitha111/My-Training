package AccessModifiers;

public class Access1 {
	
	public int i;
	private int j;
	protected int k;
	int l;
	
	public void publicMethod()
	{
		System.out.println(i);
	}
	private void privateMethod()
	{
		System.out.println(j);
	}
	protected void protectedMethod()
	{
		System.out.println(k);
		System.out.println("New change");
	}
	void defaultMethod()
	{
		System.out.println(l);
	}
	/*public static void main(String args[])
	{
		Access1 acc=new Access1();
		acc.publicMethod();
		acc.privateMethod();
		acc.protectedMethod();
		acc.defaultMethod();
		
	}*/

}
