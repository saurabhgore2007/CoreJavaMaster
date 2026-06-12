package Day9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx3 {

	public static void main(String[] args) {


		Pattern p = Pattern.compile("\\bJava\\b");
		Matcher m = p.matcher("Java");
		
		 if (m.find()) {
	            System.out.println("Word 'java' found!");
	     } 
		 else {
	            System.out.println("Word not found.");
	     }
	}

}
