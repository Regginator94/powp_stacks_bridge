package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class StackTest {

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}
	//testIsFull zwraca faila ponieważ lista nie posiada określonej długości w prezciwiestwie do StackArray

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testHanoiPush() {
		StackHanoi stackHanoi = new StackHanoi();
		
		int testValue = 4;
		stackHanoi.push(testValue);
		
		int result = stackHanoi.top();
		
		Assert.assertEquals(testValue, result);
	}
	
	
	@Test
	public void testFIFOPop(){
		StackFIFO stackFIFO = new StackFIFO();
		final int EMPTY_STACK_VALUE = -1;
		int result;
		
		int testValue = 10;
		stackFIFO.push(testValue);
		
		result = stackFIFO.pop();		
		Assert.assertEquals(result, testValue);
		
		result = stackFIFO.pop();
		Assert.assertEquals(result, EMPTY_STACK_VALUE); // z powodu zmiany empty_stack_value na 0 testy zwracały fail
		
	}

}
