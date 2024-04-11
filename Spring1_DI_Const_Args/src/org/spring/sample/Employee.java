package org.spring.sample;

public class Employee {
	private int id;
	private String name;
	
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
}
