package edu.kis.vh.stacks.list;

public interface IStack {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}