package edu.kis.vh.stacks;

import edu.kis.vh.stacks.structures.IStack;
import edu.kis.vh.stacks.structures.StackList;

public class StackFIFO extends Stack {

	private Stack temp = new Stack(new StackList());   //stackList posiada dynamiczną długość dzięki czemu jest prostsza w obsłudze niż stackArray
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack iStack) {
		super(iStack);
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
