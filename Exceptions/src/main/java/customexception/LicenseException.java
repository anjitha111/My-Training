package customexception;

public class LicenseException extends Exception {

	LicenseException(String s)
	{
		super(s);//Calling the constructor of parent exception
	}
}
