package encapsalation1;

public class Bank {
	private double pin_num;
	public void setter(double pin_num)
	{
		this.pin_num=pin_num;
	
	}
	public void getter()
	{
		if(pin_num==1001||pin_num==1234||pin_num==1212)
		{
			System.out.println("Entered pin is correct.");
		}
		else
		{
			System.out.println("Entered pin is wrong.");
		}
	
	}

}
