package com.sahana.city;

import com.sahana.city.cityward.CityWard;
import com.sahana.city.constants.WardName;
import com.sahana.city.dto.CityDTO;

public class CityWardTester {
	public static void main(String[] args) {
		CityWard cityward=new CityWard();
		CityDTO ward=new CityDTO(1, WardName.BTM, "sahana", 4000, "10000sqkms");
		cityward.addWardInfo(ward);
		cityward.displayCityWardInfo();
		cityward.displayByNameOrNumber(WardName.BTM, 1);
		
		
		
		CityDTO ward2=new CityDTO(2, WardName.HUBLI, "sapna", 3000, "20000sqkms");
		cityward.addWardInfo(ward2);
		cityward.displayCityWardInfo();
		cityward.displayByNameOrNumber(WardName.HUBLI, 2);
	}

}
