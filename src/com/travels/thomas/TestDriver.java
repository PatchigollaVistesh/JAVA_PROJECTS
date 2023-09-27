package com.travels.thomas;

import java.util.*;

public class TestDriver {

	private static final Driver DRIVER = new Driver("Car", 1, "RAJESH", 1000);

	private static void testData() {
		Driver driver1 = DRIVER;
		Driver driver2 = new Driver("Lorry", 3, "RAJU", 1050);
		Driver driver3 = new Driver("Car", 2, "VIGNESH", 920);
		Driver driver4 = new Driver("Bike", 4, "VINAY", 1500);
		Driver driver5 = new Driver("Car", 5, "VAMSI", 2400);

		driverList.add(driver1);
		driverList.add(driver2);
		driverList.add(driver3);
		driverList.add(driver4);
		driverList.add(driver5);
	}

	public static ArrayList<Driver> driverList = new ArrayList<>();

	public static void main(String[] args) {
		TestDriver td = new TestDriver();
		testData();

		Travel travel = new Travel();

		// checking isCarDriver Method in travel class
		boolean status = travel.isCarDriver(DRIVER);
		System.out.println("Is car driver exists : " + status);

		// checking retrievebyDriverId Method in travel class
		String driverDetails = travel.retrievebyDriverId(driverList, 1);
		System.out.println(driverDetails);

		//retrieveCountofDriver in travel class
		System.out.println(travel.retrieveCountofDriver(driverList, "Lorry"));
		
		//checking list drivers according to the required category  
		ArrayList<Driver> retrieveDriverData = travel.retrieveDriver(driverList, "Car");
		System.out.println(retrieveDriverData);
		
		//getting Maximum Distance Travelled Driver 
		System.out.println(travel.retrieveMaximumDistanceTravelledDriver(driverList));
	}

}
