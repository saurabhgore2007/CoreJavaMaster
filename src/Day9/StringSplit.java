package Day9;

public class StringSplit {

	public static void main(String[] args) {

		String data = "apple,banana,grape";
        String[] fruits = data.split(",");

        for (String f : fruits) {
            System.out.println(f);
        }
	}

}
