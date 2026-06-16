package Day10;

import java.util.Stack;

/* Write a code to validate weather a Number sequence is valid sequence or not ? */

public class StackEx3 {

	public static void main(String[] args) {

		String pattern = "122120023113";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<pattern.length();i++) {
			
			char ch = pattern.charAt(i);
			
		    if(!stack.empty() && stack.peek() == ch) {
		        stack.pop();
		    } else {
		        stack.push(ch);
		    }
		}
		
		if(stack.empty())
		{
			System.out.println("Bracket Sequence is valid");
		}
		else
		{
			System.out.println("Bracket Sequence is Wrong");
		}

	}

}
