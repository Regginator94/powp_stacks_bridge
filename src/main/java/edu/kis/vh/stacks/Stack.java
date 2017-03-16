package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackArray;

/**
 * @author KUBA
 * @version 2.0
 */
public class Stack {
	
	private static final int EMPTY_STACK_VALUE = -1;  
	
	private static final int STACK_SIZE_VALUE = 12;  
	
	private static final int STACK_FULL_VALUE = 11; 
	
	private int[] items = new int[STACK_SIZE_VALUE]; 
	
	private int total = EMPTY_STACK_VALUE;
	
	private StackArray stackArray = new StackArray();
	
	public Stack() {
		
	}
	
	public Stack(int[] items, int total, StackArray stackArray) {
		super();
		this.items = items;
		this.total = total;
		this.stackArray = stackArray;
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}



	
}
