package Day10;

import java.util.Stack;

/* Write a code to validate weather a bracket sequence is valid sequence or not ? */

public class StackEx2 {

	public static void main(String[] args) {

		String pattern = "{()}{<>}{]";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<pattern.length();i++) {
			
			char ch = pattern.charAt(i);
			
			if(ch=='{' || ch=='(' || ch=='<' || ch=='[') {
				stack.push(ch);
			}
			else if((ch=='}' && stack.peek()=='{') || (ch==')' && stack.peek()=='(') ||
					(ch=='>' && stack.peek()=='<') || (ch==']' && stack.peek()=='[')) {
				stack.pop();
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
