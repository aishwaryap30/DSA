package com.demo.Stack;

public class Stack {
	

	  int maxSize;
	  int[] arrayStack;
	  int top;

	  public Stack(int maxsize){
	    this.maxSize = maxsize;
	    this.arrayStack = new int[maxSize];
	    this.top=-1;
	  }

	  public boolean isEmpty(){
	    return top ==-1;
	  }

	  public boolean isFull(){
	    return top == maxSize-1;
	  }
	  
	  public void push(int value){
	    if(isFull()){
	      System.out.println("Stack Overflow-----------");
	      return;
	    }
	    arrayStack[++top]= value;
	  }

	  public int pop(){
	    if(isEmpty()){
	      System.out.println("Stack Underflow----------");
	    }
	    int value= arrayStack[top--];
	    return value;
	  }

	  public int size(){
	    return top+1;
	  }

	  public static void printStack(int[] arrayStack){
	    for(int ele : arrayStack){
	      System.out.println(ele);
	    }
	  }


	public static void main(String[] args) {
		
		Stack st = new Stack(5);
	    st.push(50);
	    st.push(30);
	    st.push(10);
	    st.pop();
	    st.pop();
		
	}

}
