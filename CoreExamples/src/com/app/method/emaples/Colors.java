package com.app.method.emaples;

public class Colors {

	void message(char code)
	{
		switch (code) {
		case 'R': System.out.println("RED COLOR");
			
			break;
		case 'G': System.out.println("GREEN COLOR");
		
		    break;
		    
		case 'B': System.out.println("BLUE COLOR");
		
		break;    
			
		default: System.out.println("I am not sure!");
			break;
		} 
	}  

	public static void main(String[] args) {

		Colors c = new Colors();
		c.message('R');
		/*c.message('B');
		c.message('B');*/

	}
}
