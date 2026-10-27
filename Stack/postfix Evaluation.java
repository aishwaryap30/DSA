package com.demo.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixEvaluation {
	
	public static int postfixEvaluation(String postfix) {
		
		Deque<Integer> stack = new ArrayDeque<>();
		char[] arr= postfix.toCharArray();
		
		for(char ch : arr) {
			
			if (ch == ' ') continue;
			
			if(Character.isDigit(ch)){
				stack.push(ch - '0');
			}
			else {
				int operand1= stack.pop();
				int operand2= stack.pop();
				
				int result =0;
				
				switch(ch) {
					case  '+':
						result = operand1 + operand2;
					break;
					
					case '-':
						result = operand1 - operand2;
					break;
					
					case '*':
						result = operand1 * operand2;
					break;
					
					case '/':
						result = operand1 / operand2;
					break;
					
					default:
						throw new IllegalArgumentException("Invalid Operator ");	
				
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
  
	public static void main(String[] args) {
	
		String postfix="21+3*" ;
		int result = postfixEvaluation(postfix) ;
        System.out.println("Result: " + result); 	
	}

}
