package edu.kis.vh.stacks.structures;

public interface IStack {
	
	static final int EMPTY_STACK_VALUE = -1; // dzięki preniesiuniu atrybutu do interfejsu wystraczy 
										//zmienić wartość tylko w interfejsie zamiast we wszystkich klasach implementujących
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}