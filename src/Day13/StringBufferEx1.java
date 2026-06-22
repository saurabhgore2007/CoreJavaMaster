package Day13;

public class StringBufferEx1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");

		sb.append(" Programming");
		System.out.println(sb);

		sb.insert(4, " Language");
		System.out.println(sb);

		sb.replace(0, 4, "Python");
		System.out.println(sb);

		sb.delete(0, 7);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
