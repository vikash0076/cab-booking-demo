package com.car.app;

import com.car.app.entity.Driver;
import com.car.app.entity.User;
import com.car.app.service.CabBookingSystem;

public class DriverDemo {
	public static void main(String[] args) {
		CabBookingSystem cabService = new CabBookingSystem();
		
		//adding user
		cabService.addUser(new User('M', "Abhishek", 23));
		cabService.addUser(new User('M', "Rahul", 29));
		cabService.addUser(new User('F', "Nandini", 22));
		
		//adding Driver
		cabService.addDriver(new Driver("Driver1", 'M', 22, "Swift", "KA-01-12345", 10, 1, true));
		cabService.addDriver(new Driver("Driver2", 'M', 29, "Swift", "KA-01-12345", 10, 10, true));
		cabService.addDriver(new Driver("Driver3", 'M', 24, "Swift", "KA-01-12345", 5, 3, true));
		
		//finding ride
		cabService.findRide("Abhishek", 0, 0, 20, 1);
		cabService.findRide("Rahul", 10, 0, 15, 3);
		cabService.findRide("Nandini", 15, 6, 20, 4);
		
		//choosing Driver1 for Rahul
		cabService.chooseRide("driver1");
		
	}
}
