package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStackFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStackFactory;

class StacksDemo {
	// Źle sformatowane linie : 13, 19-27
	// Alt + ← and Alt + → - wraca do miejsc które poprzednio odwiedziłeś
	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		ListStackFactory listStackFactory = new ListStackFactory();
		ArrayStackFactory arrayStacksFactory = new ArrayStackFactory();

		testStacks(factory);
		testStacks(listStackFactory);
		testStacks(arrayStacksFactory);
		// zasade izolacji łamia klasy fabryk w zależności od implementacji zwracają one StackList lub StackArray	
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}
	
	
}