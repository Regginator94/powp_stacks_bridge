package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

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
	
	private StackList stackList = new StackList();
	
	public Stack() {
		
	}
	
	public Stack(int[] items, int total, StackList stackList) {
		super();
		this.items = items;
		this.total = total;
		this.stackList = stackList;
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}

	
}
