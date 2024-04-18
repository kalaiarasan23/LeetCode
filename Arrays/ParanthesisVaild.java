package ArrayExecise;

import java.util.Stack;

public class ParanthesisVaild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("()[]{}"));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
				stack.add(s.charAt(i));
			else if(s.charAt(i) == '}' && !stack.isEmpty())
			{
				if(stack.peek() == '{')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i) == ']'&& !stack.isEmpty())
			{
				if(stack.peek() == '[')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i) == ')' && !stack.isEmpty())
			{
				if(stack.peek() == '(')
					stack.pop();
				else
					return false;
			}
			else
			{
				return false;
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

}
