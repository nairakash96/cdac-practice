package com.app;

import custom_exception.DSAException;

public class StackImpl implements StackIntf {
	public int top=-1;
	public final int SIZE=5;
	public int arr[]=new int[SIZE];
	
	
	@Override
	public void Push(int elem) throws DSAException {
		if(IsFull()) {
		 throw new DSAException("OVER FLOW");
		}else 
		arr[++top]=elem;
		System.out.println(elem+"  added to stack");
		System.out.println("Stack Elements are ");
		Display();

	}

	@Override
	public int Pop() throws DSAException {
		if(IsEmpty())
			throw new DSAException("UNDER FLOW");
		return arr[--top];
	}

	@Override
	public boolean IsEmpty() {
		return top==-1;
	}

	@Override
	public boolean IsFull() {
		return top==(SIZE-1);
	}

	@Override
	public void Display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
