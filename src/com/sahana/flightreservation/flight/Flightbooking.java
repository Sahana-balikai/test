package com.sahana.flightreservation.flight;

import com.sahana.flightreservation.dto.FlightDTO;

public class Flightbooking {
	// private FlightDTO flightDTO;
	private FlightDTO[] flights = new FlightDTO[5];
	private int currentIndex = 0;

	public Flightbooking() {
		System.out.println("invoked flightbooking");
	}

	public void acceptBooking(FlightDTO dto) {

		if (dto != null && this.currentIndex <= 5) {
			if (dto.getAirplaneCode() != null && dto.getBuisnessclassprice() != 0.0 && dto.getStartingPoint() != null
					&& dto.getCompany() != null && dto.getBuisnessclassprice() >= 1000) {

				System.out.println("we can accept booking");
				System.out.println("current index is " + this.currentIndex);
				this.flights[this.currentIndex] = dto;
				this.currentIndex++;
			} else {
				System.out.println("conditions are invalid");
			}
		}

	}

	public void displayFlights() {
		for (int i = 0; i < this.flights.length; i++) {
			if (this.flights[i] != null) {

				FlightDTO dto = this.flights[i];

				System.out.println(dto.getAirplaneCode());
				System.out.println(dto.getNoOfSeats());
				System.out.println(dto.getBuisnessclassprice());
				System.out.println(dto.getStartingPoint());
				System.out.println(dto.getDestination());
				System.out.println(dto.getEconomyclassprice());
				System.out.println(dto.getCompany());
			}
		}

	}

	public void searchFlightByStartingPoint(String startingPoint) {
		if (startingPoint != null) {
			System.out.println("search the flight by starting point");
			boolean start = false;
			for (int i = 0; i < this.flights.length; i++) {
				FlightDTO ref = this.flights[i];
				if (flights[i] != null) {
					String localstart = ref.getStartingPoint();
					if (startingPoint.equals(localstart)) {
						System.out.println("starting point is" + ref.getStartingPoint());
						System.out.println(ref.getAirplaneCode());
						System.out.println(ref.getCompany());
						System.out.println(ref.getNoOfSeats());
						System.out.println(ref.getBuisnessclassprice());
						System.out.println(ref.getEconomyclassprice());
						start = true;

					}
				} else {
					start = false;
					// System.out.println("starting point not found");
				}

			}

			if (start == false) {
				System.out.println("starting point not found");
			}

		}
	}
}
