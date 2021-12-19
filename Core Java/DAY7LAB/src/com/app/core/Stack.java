package com.app.core;

public interface Stack {
	//data member : public static final
	int STACK_SIZE=4;
	//method : specs : public abstract
	void push(Emp e);
	Emp pop();
}
