package edu.kis.vh.stacks.structures;

public interface IStack {
	
	static final int EMPTY_STACK_VALUE = -1; 

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}