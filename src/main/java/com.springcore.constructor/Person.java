package com.springcore.constructor;

public class Person {
	
	private String name;
	private int personID;
	private Certificate certi;
	public Person(String name, int personID, Certificate certi) {
		super();
		this.name = name;
		this.personID = personID;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personID=" + personID + ", certi=" + certi + "]";
	}
	
	
	
	
	

}
