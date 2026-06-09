package Day8.ExceptionEx4.UserSetting;

public class UserAccount {

	public String userName;
	public String mobileNumber;
	
	public UserAccount() {
		this.userName = "";
		this.mobileNumber = "";
	}
	
	public UserAccount(String userName, String mobileNumber) {
		super();
		this.userName = userName;
		this.mobileNumber = mobileNumber;
	}
	
	public boolean isMobileNumberValid() {
		
		return mobileNumber.length()==10 && (mobileNumber.charAt(0)==7 || mobileNumber.charAt(0)==8 ||mobileNumber.charAt(0)==9);
	}
}
