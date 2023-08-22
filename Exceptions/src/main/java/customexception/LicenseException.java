package customexception;

public class LicenseException extends Exception {

	LicenseException(String s)
	{
		super(s);//Calling the parent class "Exception".
	}
}
