package com.car.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.app.entity.Driver;
import com.car.app.entity.Ride;
import com.car.app.entity.User;
import com.car.app.service.CabBookingSystem;

@RestController
public class Controller {

	@Autowired
	CabBookingSystem cabService;

	@PostMapping(value = "/addUser")
	public String addUser(@RequestBody User user) {
		String response = cabService.addUser(user);
		if(response.equals("error"))
			return "Error occured while adding User.";
		return "User added successfully";
	}

	@PostMapping(value = "/addDriver")
	public String addDriver(@RequestBody Driver driver) {
		String response = cabService.addDriver(driver);
		if(response.equals("error"))
			return "Error occured while adding Driver.";
		return "Driver added successfully";
	}

	@GetMapping(value = "/getUser")
	public List<User> getUser() {
		return cabService.getAllUser();
	}

	@GetMapping(value = "/getDriver")
	public List<Driver> getDriver() {
		return cabService.getAllDriver();
	}

	@GetMapping(value = "/getRides")
	public String getRides(@RequestBody Ride ride) {
		List<String> li = cabService.findRide(ride.getName(), ride.getSourceLat(), ride.getSourceLong(), ride.getDestinationLat(),
				ride.getDestinationLong());
		if(li.isEmpty()) {
			return "No ride found";
		}
		return "Rides - "+li;
	}

	@PostMapping(value = "/chooseRide")
	public String chooseRide(@RequestBody Ride ride) {
		String response =cabService.chooseRide(ride.getDriverName());
		return response;
	}
}
