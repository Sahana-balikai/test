package com.sahana.hotel.hotelinfo;

import java.util.Arrays;

import com.sahana.hotel.constants.Location;
import com.sahana.hotel.dto.HotelDTO;

public class HotelInfo {
	HotelDTO[] hotel = new HotelDTO[5];
	private int currentIndex = 0;

	public HotelInfo() {
		System.out.println("invoked hotel information");
	}

	public void addHotelInfo(HotelDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("accepting the hotel information");
			System.out.println("current index:" + this.currentIndex);
			this.hotel[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("Invalid data,Enter proper Details");
			}

			if (dto != null) {
				System.out.println("cannot add more information" + this.currentIndex);
			}

			System.out.println("current index is" + this.currentIndex);
		}
	}
	
	
	public void displayHotelInfo() {
		for(int i=0;i<hotel.length;i++) {
			HotelDTO dto=hotel[i];
			if(dto!=null) {
				System.out.println("hotel name : " +dto.getName());
				System.out.println("hotel location : " +dto.getLocation());
				System.out.println("hotel type : " +dto.getType());
				System.out.println("hotel owner : " +dto.getOwnername());
				System.out.println("hotel service : " +dto.isService());
				System.out.println(Arrays.toString(dto.getFoodItems()));
				break;
			}
		}
	}
	
	
	public void displayByNameAndLocation(String name,Location location) {
		if(name!=null && location!=null) {
			System.out.println("printing by name and location of hotel");
			boolean start=false;
			for(int i=0;i<hotel.length;i++) {
				HotelDTO ref=this.hotel[i];
				if(ref!=null) {
					String localname=ref.getName();
					Location locallocation=ref.getLocation();
					if(name.equals(localname) && location.equals(locallocation)) {
						start=true;
						System.out.println("hotel name is : " +ref.getName());
						System.out.println("hotel location is : " +ref.getLocation());
						break;
					}
					
					
					
				}
			}
			if(start==false) {
				System.out.println("Hotel not found");
			}
		}
	}
	
	
	public void returnOwner(String Ownername) {
		if(Ownername!=null) {
			boolean start=false;
			for(int i=0;i<hotel.length;i++) {
				if(this.hotel[i]!=null) {
					System.out.println("displaying owner name");
					HotelDTO refOfStart=this.hotel[i];
					refOfStart.setOwnername("sahana");
					String localownername=refOfStart.getOwnername();
					if(Ownername.equals(localownername)) {
						System.out.println("owner name is found");
						System.out.println("owner name is : " +refOfStart.getOwnername());
						break;
					}
				}
			}
			if(start==false) {
				System.out.println("owner not found");
			}
		}
	}

}
