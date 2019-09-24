package com.app.method.emaples;

public class Message {

	static void show(String name)
	{  
		System.out.println("Hello :"+name);  
	} 
	void msg()
	{
		System.out.println("Hello " + "Ashok");
	}
	public static void main(String[] args) {

		//Calling static method
		Message.show("Ashok Reddy");
		Message msg = new Message();
		msg.msg();
	}

}
