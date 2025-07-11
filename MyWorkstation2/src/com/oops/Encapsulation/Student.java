package com.oops.Encapsulation;

public class Student {
	
//	private String FirstName="jamie";
//	private String LastName="fox";
//	private int age=32;
//	private String College="Natural sience";
//	public String getFirstName() {
//		return FirstName;
//	}
//	public String getLastName() {
//		return LastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public String getCollege() {
//		return College;
//	}
//	
	private String FirstName;
	private String LastName;
	private int age;
	private String College;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}


}

// in order to access those datas ..we right click on it we gonna generatepublic method by reight click on it then generate then click getter for all of thenm

// we set our value here so we only need get metho.
// if we have not value we can generate setter as well.

