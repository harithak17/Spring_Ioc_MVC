package org.spring.autowiring;

//This class contains reference of B class and constructor and method.


public class A {
	
	B b;  
	A(){
		System.out.println("a is created");
		} 
	
	// Constructor injection
	A(B b)
	{
		this.b=b;

	}
	
	
	
	public B getB() 
	{  
	    return b;  
	}  
	public void setB(B b) 
	{  
	    this.b = b;  
	}  
	
	
	
	
	

	void print()
	{
		System.out.println("hello a");
	}  
	
	void displayb()
	{  
	    print();  
	    b.print();  
	} 
	
	

}
