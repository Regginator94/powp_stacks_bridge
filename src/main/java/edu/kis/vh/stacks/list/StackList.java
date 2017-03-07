package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1; //modyfikator final został ustawiony przy tworzeniu deklaracji stałych
	private Node last;
	int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (empty())
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



