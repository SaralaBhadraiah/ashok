package com.app.method.emaples;

public class Extreems {

	static void root(int x) 
	{    
		int res= x++ + ++x ;    
		System.out.println("Result is :"+res);   
	}   
	void mul(int x,int y) 
	{    
		System.out.println("Result is :"+(x*y));   
	}   
	void power(int x) 
	{    
		System.out.println("Result is :"+(x*x));   
	}   
	void quote(int x,int y) 
	{    
		int res = x+2 - (y/2)*4;    
		System.out.println("result is :"+res);  
	} 

	public static void main(String[] args) {

		Extreems.root(9);
		Extreems extreem = new Extreems();
		extreem.mul(6, 5);
		extreem.power(6);
		extreem.quote(6, 5);
		

	}

}
