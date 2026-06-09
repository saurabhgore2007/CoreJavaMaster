package Day8.ExceptionEx4.custom;

public class InvalidMobileNumberException extends Exception {

	public InvalidMobileNumberException()
	{
		super();
	}
	
	public InvalidMobileNumberException(String msg)
	{
		super(msg);
	}
}
