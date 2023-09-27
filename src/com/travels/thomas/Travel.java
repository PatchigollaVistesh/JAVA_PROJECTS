package com.travels.thomas;

import java.util.*;

public class Travel {

	public boolean isCarDriver(Driver driver) {
//	generally we write like this
//		if(driver.getCategory().equal("Car")) {
//			return true;
//		}
//		return false;

//		in a single line
		return driver.getCategory().equalsIgnoreCase("Car");
	}

	public String retrievebyDriverId(ArrayList<Driver> driverList, int driverId) {
//	searching driverId in driverList
		
		for (Driver driver : driverList) {
			if (driver.getDriverId() == driverId) {
				return "Driver name is " + driver.getDriverName() + " belonging to the category " + driver.getCategory()
						+ " traveled " + driver.getTotalDistance() + " KM so far.";
			}
		}
		return "OOOPS! NO DRIVER IS FOUND WITH GIVEN DRIVER ID ";

	}

	public int retrieveCountofDriver(ArrayList<Driver> driverList, String category) {
//	Count of drivers according to the given category
		
		int numberofDriver = 0;
		for (Driver driver : driverList) {
			if (driver.getCategory().equalsIgnoreCase(category)) {
				numberofDriver++;
			}
		}
		return numberofDriver;
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> driverList, String category) {
//	drivers list according to the required category
		ArrayList<Driver> specificCategoryDriver = new ArrayList<>();
		for( Driver driver : driverList ) {
			if(driver.getCategory().equals(category)) {
				specificCategoryDriver.add(driver);
			}
		}
		return specificCategoryDriver;
	}

	public Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
//	producing maximum distance travelled driver among all
		Driver driverMaximumDistanceTravelled = driverList.get(0);
		
		for(Driver driver : driverList) {
			if(driver.getTotalDistance() > driverMaximumDistanceTravelled.getTotalDistance()) {
				driverMaximumDistanceTravelled = driver;
			}
		}
		return driverMaximumDistanceTravelled;
		
	}
}
