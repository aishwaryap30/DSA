package com.demo.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

	public static boolean BalancedParentheses(String str) {
		
		Deque<Character> stack = new ArrayDeque<>();
		
		char[] arr= str.toCharArray();
		
		for(char ch : arr) {
			
			// 1. If it's an opening bracket, push to stack
			if (ch == '{' || ch== '(' || ch== '[') {
				stack.push(ch);
			}
			
			// 2. If it's a closing bracket
			else if (ch == '}' || ch == ')' || ch == ']') {
				
				// If stack is empty, we have a closing bracket with no opening pair
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				// Check if the popped opening bracket matches the current closing bracket
				if(ch == ')' && top != '(') return false;
				if(ch == '}' && top != '{') return false;
				if(ch == ']' && top != '[') return false;
			}
		}
		//If the stack is empty, all opening brackets were closed
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		String test1 = "{[()]}";
        String test2 = "([)]";
        String test3 = "(((";

        System.out.println(test1 + " -> " + BalancedParentheses(test1));
        System.out.println(test2 + " -> " + BalancedParentheses(test2)); 
        System.out.println(test3 + " -> " + BalancedParentheses(test3)); 
	}

}
