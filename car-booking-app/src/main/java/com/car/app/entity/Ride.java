package com.car.app.entity;

public class Ride {

	private int sourceLat;
	private int sourceLong;
	private int destinationLat;
	private int destinationLong;
    private String name;
    private String driverName;
    
	public Ride(int sourceLat, int sourceLong, int destinationLat, int destinationLong, String name, String driverName) {
		super();
		this.sourceLat = sourceLat;
		this.sourceLong = sourceLong;
		this.destinationLat = destinationLat;
		this.destinationLong = destinationLong;
		this.name = name;
		this.driverName = driverName;
	}

	public int getSourceLat() {
		return sourceLat;
	}

	public void setSourceLat(int sourceLat) {
		this.sourceLat = sourceLat;
	}

	public int getSourceLong() {
		return sourceLong;
	}

	public void setSourceLong(int sourceLong) {
		this.sourceLong = sourceLong;
	}

	public int getDestinationLat() {
		return destinationLat;
	}

	public void setDestinationLat(int destinationLat) {
		this.destinationLat = destinationLat;
	}

	public int getDestinationLong() {
		return destinationLong;
	}

	public void setDestinationLong(int destinationLong) {
		this.destinationLong = destinationLong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	
}
