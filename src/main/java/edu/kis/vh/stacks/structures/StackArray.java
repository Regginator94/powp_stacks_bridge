package edu.kis.vh.stacks.structures;

public class StackArray implements IStack {
	
	private static final int EMPTY_STACK_VALUE = -1; 
	private static final int STACK_SIZE_VALUE = 12;  
	private static final int STACK_FULL_VALUE = 11;
	private int[] items = new int[STACK_SIZE_VALUE]; 
	
	private int total = EMPTY_STACK_VALUE;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}


	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

	public int getTotal() {
		return total;
	}

	
	
}
