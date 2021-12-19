package com.app.core;

public class FixedStack implements Stack {
	//state : non static data member, allocated in heap,/ every instance
	//HAS-A relationship : association
	private Emp emps[];// heap : null
	private int top;//heap def inited=0: 

	public FixedStack() {
		super();
		top = -1;
		emps = new Emp[STACK_SIZE];
	}
	//push
	@Override
	public void push(Emp e) {
		if (top < STACK_SIZE-1) {
			emps[++top]=e;
			System.out.println("Pushed Successful!!");
		} else
			System.out.println("Array Size full");
	}
	//pop
	@Override
	public Emp pop() {
		if (top != -1) {
			return emps[top--];
		} else {
			System.out.println("Stack is Empty");
			return null;
		}
	}

}
