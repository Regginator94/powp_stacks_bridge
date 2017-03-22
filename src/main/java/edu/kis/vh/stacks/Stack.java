package edu.kis.vh.stacks;

import edu.kis.vh.stacks.structures.IStack;
import edu.kis.vh.stacks.structures.StackList;

/**
 * @author KUBA
 * @version 2.0
 */
public class Stack {
	//3.1.13
	//po wciśnięciu f3 przechodzimy do deklaracji metod w interfejsie
	//ctrl + t wyśiwetla interfejs i klasy implementujące interfejs 
	// ctrl + kursor umożliwia Otwarcie Deklaracji lub Implmentacji
	private static final int EMPTY_STACK_VALUE = -1;  
	
	private static final int STACK_SIZE_VALUE = 12;  
	
	private static final int STACK_FULL_VALUE = 11; 
	
	private int[] items = new int[STACK_SIZE_VALUE]; 
	
	private int total = EMPTY_STACK_VALUE;
	
	private IStack istack;  // dzieki generalizacji na rzecz IStack możemy utowrzyć obiekt typu StackList lub StackArray gdyż 
												//obie klasy implementują interfejs IStack co gwarantuje nam posiadanie wymaganych metod/atrybutów	
	public Stack() {
		
	}
	
	public Stack(IStack iStack) {
		this.istack = iStack;
	}
	
	public Stack(int[] items, int total, IStack istack) {
		super();
		this.items = items;
		this.total = total;
		this.istack = istack;
	}

	public void push(int i) {
		istack.push(i);
	}

	public boolean isEmpty() {
		return istack.isEmpty();
	}

	public boolean isFull() {
		return istack.isFull();
	}

	public int top() {
		return istack.top();
	}

	public int pop() {
		return istack.pop();
	}


	
}
