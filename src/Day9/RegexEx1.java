package Day9;

public class RegexEx1 {

	public static void main(String[] args) {

		String regex = "^[789]\\d{9}$";
		String num1 = "9989887876";
        String num2 = "1937757273";

        System.out.println(num1.matches(regex));
        System.out.println(num2.matches(regex));
	}

}
