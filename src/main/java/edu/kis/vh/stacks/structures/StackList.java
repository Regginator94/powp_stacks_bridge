package edu.kis.vh.stacks.structures;

public class StackList implements IStack {

	private Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
	
	private class Node {
	
		private int value;
		private Node prev;
		private Node next; //W związku z hermetyzacją dostęp do pól value, prev, next jest możliwy tylko za pomocą getterów i setterów
	
		public Node(int i) {
			value = i;
		}
	
		public int getValue() {
			return value;
		}
	
		// public void setValue(int value)  - zostało usunięte
	
	
		public Node getPrev() {
			return prev;
		}
	
		public void setPrev(Node prev) {
			this.prev = prev;
		}
	
		public Node getNext() {
			return next;
		}
	
		public void setNext(Node next) {
			this.next = next;
		}
	}

}



