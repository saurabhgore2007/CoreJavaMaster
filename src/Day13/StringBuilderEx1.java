package Day13;

public class StringBuilderEx1 {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Java");
		System.out.println(str);
		str.append(" 8").append(" Programming");
		System.out.println(str);
		
		str.insert(0, "The ");
		System.out.println(str);

		str.delete(0, 4);
		System.out.println(str);
		str.reverse();
		System.out.println(str);

		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);

		sb.append(" Java");
		System.out.println(sb);

		sb.insert(5, " Awesome ");
		System.out.println(sb);

		sb.replace(14, 19,"World");
		System.out.println(sb);
		
		sb.delete(6,14);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

		sb.repeat(" Hello", 2);
		System.out.println(sb);

		System.out.println("Length :- " + sb.length() + " Capacity :- " + sb.capacity());

	}

}
