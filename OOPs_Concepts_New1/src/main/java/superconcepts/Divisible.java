package superconcepts;

public class Divisible extends AdditionResult1{
	
	public void division()
	{
		int c=super.addition(50,20);
		if(c%10==0)
		{
			System.out.println("Sum is divisible by 10.");
		}
		else
		{
			System.out.println("Sum is not divisible by 10.");
		}
	}

	public static void main(String[] args) {
		
		Divisible div=new Divisible();
		div.division();

	}

}
