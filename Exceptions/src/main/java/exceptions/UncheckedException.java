package exceptions;

import java.io.IOException;

public class UncheckedException {
	public void calc()
	{
		int a=100;
		try
		{
			
		int b=a/0;
		System.out.println("Value of b is "+b);
		}
		/*finally
		{
			System.out.println("Finally block");
		}*/
		
		catch(NullPointerException e)
		{
			System.out.println("Exception occurred is "+e);//It will print the type of exception happened here.
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurred" +e);//Here,it is handled here itself.
		}
		catch(Exception e)
		{
			System.out.println("Exception final occurred" +e);
		}
	}
	public static void main(String[] args) {
	
		UncheckedException ue=new UncheckedException();
		System.out.println("Before method call.");//Will execute this.
		ue.calc();
		System.out.println("End of the method call.");//This will not execute since exception happened before this.
	}

}
