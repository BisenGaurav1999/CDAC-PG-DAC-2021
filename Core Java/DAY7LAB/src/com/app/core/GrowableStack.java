package com.app.core;

public class GrowableStack implements Stack {
	private Emp[] emps;
	private int top;

	public GrowableStack() {
		super();
		top = -1;
		emps = new Emp[STACK_SIZE];
	}

	@Override
	public void push(Emp e) {
		if (top < emps.length - 1)// CHANGE
			{emps[++top] = e;
			System.out.println("Pushed Successful!!");
			}
		else {
			// create a new array : double original capacity
			Emp[] tmp = new Emp[emps.length*2];
			//array copy : for loop
			for (int i = 0; i < emps.length; i++) {
				tmp[i]=emps[i];
				//re assign emps ---> newly created array, marking old array for GC
				emps=tmp;
				emps[++top] = e;//Storing the ref in the new array
				System.out.println("Pushed Successful!!");
			}
		}

	}

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
