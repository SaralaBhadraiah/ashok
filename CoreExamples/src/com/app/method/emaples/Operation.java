package com.app.method.emaples;

public class Operation {

	void add(int a,int b)
	{
		System.out.println("Addition of two numbers = "+(a+b));
	}

	static void sub(int a,int b)
	{   
		System.out.println("Substraction of two numbers = "+(a-b));
	} 
	public static void main(String[] args) {

		//Operation.sub(30, 20);
		Operation op = new Operation();
		op.add(10, 20);
	}

}
