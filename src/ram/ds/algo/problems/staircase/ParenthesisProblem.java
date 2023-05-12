package ram.ds.algo.problems.staircase;

import java.util.Stack;

public class ParenthesisProblem {

	public static void main(String[] args) {
		String text = "()[]{}";
		//System.out.println(parenthesisChecker(text));

	}
	private static boolean parenthesisChecker(String text) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < text.length(); i++) {
			char brac = text.charAt(i);
			System.out.println(stack);

			if (brac == '(' || brac == '{' || brac == '[') {
				stack.push(brac);
			} else if (!stack.empty() && ((brac == ')' && stack.peek() == '(') || brac == '}' && stack.peek() == '{'
					|| (brac == ']' && stack.peek() == '['))) {
				stack.pop();
			} else {
				stack.push(brac);
			}
			

		}

		return stack.isEmpty();

	}
}
