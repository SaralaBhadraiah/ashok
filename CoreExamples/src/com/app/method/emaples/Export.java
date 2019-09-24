package com.app.method.emaples;

public class Export {

	void print(int code,String name,double sal)
	{   
		if(code==10) 
		{    
			System.out.println("Hello Admin:"+name+",Salary is:"+sal);   
		}
		else if(code==20) 
		{   
			System.out.println("Hello Developer:"+name+",Salary is:"+sal);
		}
		else if(code==30) 
		{   
			System.out.println("Hello Tester:"+name+",Salary is:"+sal); 
		}
		else 
		{ 
			System.out.println("Hello :"+name+",Salary is:"+sal); 
		}
	} 
	public static void main(String[] args) {


		Export export  = new Export();
		export.print(20, "Ashok Reddy", 52000);
		export.print(10, "Ramya", 45000);
	}

}
