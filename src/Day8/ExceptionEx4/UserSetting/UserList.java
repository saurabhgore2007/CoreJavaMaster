package Day8.ExceptionEx4.UserSetting;

import Day8.ExceptionEx4.custom.InvalidMobileNumberException;

public class UserList {

	public UserAccount  list[] = new UserAccount[5];
	
	public static int k;
	
	public UserList() {
		this.list = new UserAccount[5];
	}
	
	public UserList(UserAccount users[]) throws InvalidMobileNumberException{
		
		for(int i = 0;i<users.length;i++) {
			if(users[i].isMobileNumberValid()) {
				list[k] = users[i];
				k++;
			}
			else {
				throw new InvalidMobileNumberException(users[i].mobileNumber + " is Incorrect");
				
			}
		}
	}
}
