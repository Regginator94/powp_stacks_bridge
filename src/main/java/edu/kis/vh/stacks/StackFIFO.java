package edu.kis.vh.stacks;

import edu.kis.vh.stacks.structures.IStack;

public class StackFIFO extends Stack {

	private Stack temp = new Stack();
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(int[] items, int total, IStack istack) {
		super(items, total, istack);
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
