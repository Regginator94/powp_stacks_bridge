package edu.kis.vh.stacks;

import edu.kis.vh.stacks.structures.IStack;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public StackHanoi() {
		super();
	}	

	public StackHanoi(IStack iStack) {
		super(iStack);
	}

	public StackHanoi(int[] items, int total, IStack istack) {
		super(items, total, istack);
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
