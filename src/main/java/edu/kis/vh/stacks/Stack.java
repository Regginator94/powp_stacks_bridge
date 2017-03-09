package edu.kis.vh.stacks;

/**
 * @author KUBA
 * @version 2.0
 */
public class Stack {
	
	private static final int EMPTY_STACK_VALUE = -1;  //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private static final int STACK_SIZE_VALUE = 12;  //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private static final int STACK_FULL_VALUE = 11; //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private int[] items = new int[STACK_SIZE_VALUE]; //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	
	private int total = EMPTY_STACK_VALUE;
	
	/**
	 * This method puts number on stack
	 * @param i - number which we want put on stack
	 */
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}
	/**
	 * This method checks stack is empty
	 * @return true if stack is empty or false if not
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
	/**
	 * This method checks if stack is full
	 * @return true if stack is full or false if not
	 */
	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}

	/**
	 * This MEthod returns top value of stack
	 * @return EMPTY_SATCK_VALUE if stack is empty or top value of stack
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	/**
	 * This method pops number from stack
	 * @return EMPTY_SATCK_VALUE if stack is empty or pops value from stack
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}
	
	/**
	 * This method returns amount of numbers on stack
	 * @return total number of stack numbers
	 */
	public int getTotal() {
		return total;
	}

	//setTotal - został usunięty
}
