package exceptions;

public class UncheckedException {
	public void calc()
	{
		int a=100;
		try
		{
			
		int b=a/0;
		System.out.println("Value of b is "+b);
		}
		finally
		{
			System.out.println("Finally block");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);//It will print the type of exception happened here.
		}*/
	}
	public static void main(String[] args) {
	
		UncheckedException ue=new UncheckedException();
		System.out.println("Before method call.");//Will execute this.
		ue.calc();
		System.out.println("End of the method call.");//This will not execute since exception happened before this.
	}

}
