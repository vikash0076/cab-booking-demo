package com.car.app.entity;

public class User {

	private char gender;
    private String name;
    private int age;

    public User(char gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
	
}
