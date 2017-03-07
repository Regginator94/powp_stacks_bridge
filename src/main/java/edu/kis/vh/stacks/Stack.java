package edu.kis.vh.stacks;

public class Stack {
	
	private static final int EMPTY_STACK_VALUE = -1;  //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private static final int STACK_SIZE_VALUE = 12;  //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private static final int STACK_FULL_VALUE = 11; //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private int[] items = new int[STACK_SIZE_VALUE]; //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private int total = EMPTY_STACK_VALUE;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

	public int getTotal() {
		return total;
	}

	//setTotal - został usunięty
}
