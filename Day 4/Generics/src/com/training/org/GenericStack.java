package com.training.org;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

	private List<T> stacklist;

	public GenericStack() {
		stacklist = new ArrayList<>();
	}

	// push - add element to top of stack
	public void push(T element) {
		stacklist.add(element);
		System.out.println("Pushed: " + element);
	}

	// pop - remove and return top element of stack
	public T pop() {
		if (stacklist.isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		T top = stacklist.remove(stacklist.size() - 1);
		System.out.println("Popped: " + top);
		return top;
	}

	// 3. Peek - return top element without removing

	public T peek() {
		if (stacklist.isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		T top = stacklist.get(stacklist.size() - 1);
		System.out.println("Peeked: " + top);
		return top;
	}

	// 4. isEmpty - check if stack is empty
	public boolean isEmpty() {
		return stacklist.isEmpty();
	}

	// 5.Display - print all elements in stack
	public void display() {
		System.out.println("Stack elements: " + stacklist);
	}

	// 6. Size - return number of elements in stack
	public int size() {
		return stacklist.size();
	}

}
