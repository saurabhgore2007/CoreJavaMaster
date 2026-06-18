package Day12;

@FunctionalInterface
interface StringOperation{
    String operation(String str);
}

public class LambdaEx2 {

	public static void main(String[] args) {

		StringOperation lower = (s)-> s.toLowerCase();
		StringOperation upper = (s)-> s.toUpperCase();
		StringOperation reverse = (s)-> new StringBuilder(s).reverse().toString();
		StringOperation charCount = (s)-> String.valueOf(s.length());

		System.out.println(lower.operation("JAVA"));
		System.out.println(upper.operation("java"));
		System.out.println(reverse.operation("JAVA"));
		System.out.println(charCount.operation("Java"));
	}

}
