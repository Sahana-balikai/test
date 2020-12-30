package com.sahana.hotel;

import com.sahana.hotel.constants.HotelType;
import com.sahana.hotel.constants.Location;
import com.sahana.hotel.dto.HotelDTO;
import com.sahana.hotel.hotelinfo.HotelInfo;

public class HotelInfoTester {
	public static void main(String[] args) {
		HotelInfo hotel=new HotelInfo();
		
		String foodItems[]=new String[10];
		foodItems[0] = "chicken";
		foodItems[1] = "kaju masala";
		foodItems[2] = "pizza";
		foodItems[3] = "Burger";
		foodItems[4] = "sandwich";
		foodItems[5] = "frankies";
		foodItems[6] = "momos";
		foodItems[7] = "shawarma";
		foodItems[8] = "noodels";
		foodItems[9] = "kingfish";
		
		
		
		HotelDTO dto=new HotelDTO("Emperor Hotel", Location.WHITEFIELD, HotelType.SOUTHINDIAN, "sahana", foodItems,true);
		System.out.println("Details of hotel 1 added");
		hotel.addHotelInfo(dto);
		hotel.displayHotelInfo();
		hotel.displayByNameAndLocation("Emperor Hotel", Location.WHITEFIELD);
		hotel.returnOwner("sahana");
		
		
		HotelDTO dto1=new HotelDTO("Al-bek", Location.RAJAJINAGAR, HotelType.WESTERN, "sapna", foodItems, false);
		System.out.println("Details of hotel 2 added");
		hotel.addHotelInfo(dto1);
		hotel.displayHotelInfo();
		hotel.displayByNameAndLocation("Al-bek", Location.RAJAJINAGAR);
	
		
	}

}
