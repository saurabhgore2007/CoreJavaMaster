package Day9;

public class ReplaceText {

	public static void main(String[] args) {
		
		String text = "cat bat rat";
        String replaced = text.replaceFirst("at", "og");

        System.out.println(replaced);
        
        replaced = text.replaceAll("at", "og");

        System.out.println(replaced);
	}
}
