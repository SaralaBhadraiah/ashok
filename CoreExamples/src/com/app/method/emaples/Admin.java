package com.app.method.emaples;

public class Admin {

	static void message(boolean status)
	{  
		if(status)
		{    
			System.out.println("Yes! valid");   
		}
		else
		{   
			System.out.println("Sorry! Not valid");  
		} 
	}
	public static void main(String[] args) {

		Admin.message(true);
		//Admin.message(false);
	}

}
