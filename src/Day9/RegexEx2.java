package Day9;

public class RegexEx2 {

	public static void main(String[] args) {

		String regex = "^[A-Za-z0-9-_.]+@[a-zA-Z.-]+$";
		String email1 = "saurabhgore44@gmail.com";
		
		System.out.println(email1.matches(regex));
		System.out.println("gmail".matches(regex));  
		System.out.println("yahoo123".matches(regex));
		System.out.println("a".matches(regex));        
		System.out.println("name@domain.com".matches(regex));     
	}

}
