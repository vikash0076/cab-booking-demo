package com.car.app.entity;

public class Driver {

	private String name;
	private char gender;
	private int age;
	private String vehicleName;
	private String vehicleDetails;
	private int currentLatitude;
	private int currentLongitude;
	private boolean isAvailable;
	
	public Driver(String name, char gender, int age, String vehicleName, String vehicleDetails, int currentLatitude,
			int currentLongitude, boolean isAvailable) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.vehicleName = vehicleName;
		this.vehicleDetails = vehicleDetails;
		this.currentLatitude = currentLatitude;
		this.currentLongitude = currentLongitude;
		this.isAvailable = isAvailable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	public int getCurrentLatitude() {
		return currentLatitude;
	}
	public void setCurrentLatitude(int currentLatitude) {
		this.currentLatitude = currentLatitude;
	}
	public int getCurrentLongitude() {
		return currentLongitude;
	}
	public void setCurrentLongitude(int currentLongitude) {
		this.currentLongitude = currentLongitude;
	}
	public boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	

}
