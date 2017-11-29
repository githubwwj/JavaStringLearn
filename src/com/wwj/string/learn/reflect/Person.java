package com.wwj.string.learn.reflect;

public class Person {
	
	private int age;
	private String name;
	public String status; //成长状态
	
	public Person(){
		
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void go(){
		System.out.println("=======go==");
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String getXX() {
		return name;
	}
	

}
