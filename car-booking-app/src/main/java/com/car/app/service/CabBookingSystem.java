package com.car.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.car.app.entity.Driver;
import com.car.app.entity.User;

@Service
public class CabBookingSystem {

	private List<User> users = new ArrayList<>();;
	private List<Driver> drivers = new ArrayList<>();;

	public synchronized String addUser(User driver) {
		try {
			users.add(new User(driver.getGender(), driver.getName(), driver.getAge()));
		} catch (Exception e) {
			System.out.println("Exception while adding user :: " + e.getMessage());
			return "error";
		}
		System.out.println("User added successfully");
		return "success";
	}

	public synchronized String addDriver(Driver driver) {
		try {
			drivers.add(new Driver(driver.getName(), driver.getGender(), driver.getAge(), driver.getVehicleName(),
					driver.getVehicleDetails(), driver.getCurrentLatitude(), driver.getCurrentLongitude(), true));
		} catch (Exception e) {
			System.out.println("Exception while adding user :: " + e.getMessage());
			return "error";
		}
		System.out.println("Driver added successfully");
		return "success";
	}

	public synchronized List<String> findRide(String username, int sourceLat, int sourcelong, int destLat,
			int destLong) {
		if (sourceLat < 0 || sourcelong < 0 || destLat < 0 || destLong < 0)
			throw new RuntimeException("Ride not found for the given location.");
		List<String> rideList = new ArrayList<>();
		for (Driver driver : drivers) {
			double distance = Math.sqrt(Math.pow(driver.getCurrentLatitude() - sourceLat, 2)
					+ Math.pow(driver.getCurrentLongitude() - sourcelong, 2));
			if (distance <= 5 && driver.getIsAvailable() == true) {
				rideList.add(driver.getName());
			}
		}
		if (rideList.isEmpty()) {
			rideList.add("No ride Found");
		}
		System.out.println(rideList);
		return rideList;

	}

	public synchronized String chooseRide(String driverName) {

		if (driverName == null) {
			throw new RuntimeException("Ride not found for the selected driver.");
		}
		int i = 0;
		for (i = 0; i < drivers.size(); i++) {
			if (drivers.get(i).getName().equalsIgnoreCase(driverName)) {
				drivers.get(i).setIsAvailable(false);
				break;
			}
		}
		if (i == drivers.size()) {
			System.out.println("Please provide valid driverName");
			return "Please provide valid driverName";
		}
		System.out.println(driverName + " will reach your location soon.");
		return driverName + " will reach your location soon.";
	}

	public List<User> getAllUser() {
		return users;
	}

	public List<Driver> getAllDriver() {
		return drivers;
	}

}
