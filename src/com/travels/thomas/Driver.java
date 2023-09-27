package com.travels.thomas;

public class Driver {
	
	//private - data security in real-time projects
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	//constructor without parameter
	public Driver() {
		
	}
	//constructor with parameter
	public Driver(String category, int driverId, String driverName, double totalDistance) {
		this.category = category;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}
	
	//getters and setters for private variables
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverId=" + driverId + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}
	
	
}
