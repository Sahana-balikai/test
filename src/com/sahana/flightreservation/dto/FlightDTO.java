package com.sahana.flightreservation.dto;

import com.sahana.flightreservation.constants.Company;

public class FlightDTO {
	private String airplaneCode;
	private String startingPoint;
	private String destination;
	private int noOfSeats;
	private boolean domestic;
	private double buisnessclassprice;
	private double economyclassprice;
	//private int currentIndex = 0;
	private Company company;

	public FlightDTO() {

	}

	public FlightDTO(String airplaneCode, String startingPoint, String destination, int noOfSeats, boolean domestic,
			double buisnessclassprice, double economyclassprice) {
		super();
		this.airplaneCode = airplaneCode;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.domestic = domestic;
		this.buisnessclassprice = buisnessclassprice;
		this.economyclassprice = economyclassprice;
	}

	public String getAirplaneCode() {
		return airplaneCode;
	}

	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public double getBuisnessclassprice() {
		return buisnessclassprice;
	}

	public void setBuisnessclassprice(double buisnessclassprice) {
		this.buisnessclassprice = buisnessclassprice;
	}

	public double getEconomyclassprice() {
		return economyclassprice;
	}

	public void setEconomyclassprice(double economyclassprice) {
		this.economyclassprice = economyclassprice;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
