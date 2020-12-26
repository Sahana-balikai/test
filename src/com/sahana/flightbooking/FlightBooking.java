package com.sahana.flightbooking;
import com.sahana.constants.Company;
import java.util.Scanner;

public class FlightBooking {
	private String[] airplaneCode= {"FHT01","FHT02","FHT03"};
	private String startingPoint;
	private String destination;
	private int noOfSeats;
	private double buisnessclassprice=1000;
	private double economyclassprice;
	
	boolean[] availableseats=new boolean[10];
	Scanner input=new Scanner(System.in);
	
	public void bookFlight() {
		System.out.println("invoked flight booking");
		while(true)
		{
			bookingFlight();
		}
	}
	
	public void bookingFlight() {
		System.out.println("please choose your flight company");
		if(buisnessclassprice<=1000) {
			System.out.println("seat available in this section");
		}
		else {
			System.out.println("seat is not available");
		}
		
	}

	public String[] getAirplaneCode() {
		return airplaneCode;
	}

	public void setAirplaneCode(String[] airplaneCode) {
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

	public boolean[] getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(boolean[] availableseats) {
		this.availableseats = availableseats;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
	
	
		
		
		
	}





