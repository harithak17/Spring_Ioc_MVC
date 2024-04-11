package org.spring.depenInj;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void show()
	{
		System.out.println(id+"\t"+name);
		System.out.println(address);
	}

}
