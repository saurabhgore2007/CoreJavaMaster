package Day8.ExceptionEx4;

import Day8.ExceptionEx4.UserSetting.UserAccount;
import Day8.ExceptionEx4.UserSetting.UserList;
import Day8.ExceptionEx4.custom.InvalidMobileNumberException;

public class MainApp {

	public static void main(String[] args) {

		UserAccount users[] = {
				new UserAccount("smith", "1937757273"),
				new UserAccount("smith", "9989887876"),
				new UserAccount("smith", "675645656"),
				new UserAccount("smith", "89377572"),
				new UserAccount("smith", "9989878765")
		};
		
		UserList students = new UserList();

		try {
		    students = new UserList(users);
		}
		catch(InvalidMobileNumberException e) {
			System.out.println(e);
		}
		
		System.out.println("Total Users in List Successfully stored = " + UserList.k);
	}

}
