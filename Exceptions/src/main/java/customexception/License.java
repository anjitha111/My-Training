package customexception;

public class License {
	

	public void age(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("Not eligible");//Call goes to the LicenseException constructor. It throw an object of user defined exception.
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException 
	{
		License le=new License();
		try
		{
			le.age(10);
		}
		catch(LicenseException e) //We can give Exception class as well.
		{
			System.out.println("Inside catch "+e);
		}
		System.out.println("After method block.");
	}

}
