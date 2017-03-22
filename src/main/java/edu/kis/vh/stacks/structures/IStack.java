package edu.kis.vh.stacks.structures;

public interface IStack {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}