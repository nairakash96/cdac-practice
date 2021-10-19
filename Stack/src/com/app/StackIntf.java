package com.app;

import custom_exception.DSAException;

public interface StackIntf {
	public void Push(int elem) throws DSAException;
	public int Pop() throws DSAException;
	public boolean IsEmpty();
	public boolean IsFull();
	public void Display();
}