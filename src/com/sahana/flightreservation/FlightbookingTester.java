package com.sahana.flightreservation;

import com.sahana.flightreservation.constants.Company;
import com.sahana.flightreservation.dto.FlightDTO;
import com.sahana.flightreservation.flight.Flightbooking;

public class FlightbookingTester {
	public static void main(String[] args) {
		Flightbooking flightbooking = new Flightbooking();
		FlightDTO dto = new FlightDTO();
		dto.setAirplaneCode("AIR1");
		dto.setNoOfSeats(10);
		dto.setBuisnessclassprice(2000);
		dto.setStartingPoint("hubli");
		dto.setDestination("bangalore");
		dto.setEconomyclassprice(3000);
		dto.setCompany(Company.LUFTHANSA);
		dto.setDomestic(true);
		flightbooking.acceptBooking(dto);
		flightbooking.displayFlights();

		FlightDTO dto1 = new FlightDTO();

		dto1.setAirplaneCode("AIR2");
		dto1.setNoOfSeats(20);
		dto1.setBuisnessclassprice(4000);
		dto1.setStartingPoint("chennai");
		dto1.setDestination("delhi");
		dto1.setEconomyclassprice(5000);
		dto1.setCompany(Company.KINGFISHER);
		flightbooking.acceptBooking(dto1);
		flightbooking.displayFlights();

		flightbooking.searchFlightByStartingPoint("hubli");

	}

}
