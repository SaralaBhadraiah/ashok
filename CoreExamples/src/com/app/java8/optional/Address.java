package com.app.java8.optional;

public class Address {

	public static final Address EMPTY_ADDRESS = new Address("","","",0); 
	private final String line1;
	private final String city; 
	private final String country; 
	private final int pincode;
	public Address(String line1, String city, String country, int pincode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String line1()
	{
		return line1; 
	} 
	public String city()
	{
		return city; 
	} 
	public String country()
	{ 
		return country; 
	} 
	public int pincode()
	{ 
		return pincode; 
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

	
}
