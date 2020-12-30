package com.sahana.hotel.dto;

import com.sahana.hotel.constants.HotelType;
import com.sahana.hotel.constants.Location;

public class HotelDTO {
	private String name;
	private Location location;
	private HotelType type;
	private String Ownername;
	private String[] foodItems;
	private boolean Service;
	
	public HotelDTO() {
		System.out.println("invoked hotelDTO");
	}

	

	public HotelDTO(String name, Location location, HotelType type, String ownername, String[] foodItems,
			boolean service) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		Ownername = ownername;
		this.foodItems = foodItems;
		Service = service;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public HotelType getType() {
		return type;
	}

	public void setType(HotelType type) {
		this.type = type;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}



	public boolean isService() {
		return Service;
	}



	public void setService(boolean service) {
		Service = service;
	}
	
	
	
	

}
