package com.sahana.city.cityward;

import com.sahana.city.constants.WardName;
import com.sahana.city.dto.CityDTO;

public class CityWard {
	private CityDTO[] ward=new CityDTO[5];
	private int currentIndex=0;
	
	public CityWard() {
		System.out.println("invoked cityward");
	}
	
	public void addWardInfo(CityDTO dto) {
		if(dto!=null && this.currentIndex<5) {
			if(dto.getWardName()!=null && dto.getWardNumber()!=0 && dto.getPopulation()<5000) {
				System.out.println("ward data can be added");
				System.out.println("current index is :" +this.currentIndex);
				ward[this.currentIndex]=dto;
				this.currentIndex++;
			}else {
				System.out.println("ward data cannot be added");
			}
		}
}
	
	
	public void displayCityWardInfo() {
		for(int i=0;i<ward.length;i++) {
			if(this.ward[i]!=null) {
				System.out.println("invoked display city ward info");
				CityDTO ref=this.ward[i];
				System.out.println("ward number : " +ref.getWardNumber());
				System.out.println("ward name : " +ref.getWardName());
				System.out.println("ward corporator name : " +ref.getCorporatorName());
				System.out.println("ward population is : " +ref.getPopulation());
				System.out.println("ward area is : " +ref.getArea());
				System.out.println("    ");
				
				
			}
		}
	}
	
	
	
	public void displayByNameOrNumber(WardName name,int wardNumber) {
		if(name!=null || wardNumber>0) {
			boolean start=false;
			for(int i=0;i<ward.length;i++) {
				if(this.ward[i]!=null) {
					CityDTO ref=this.ward[i];
					WardName localname=ref.getWardName();
					int localnumber=ref.getWardNumber();
					if(name.equals(localname)||wardNumber==localnumber) {
						System.out.println("invoked display by name or number");
						start=true;
						System.out.println("ward name is : " +ref.getWardName());
						System.out.println("ward number is : " +ref.getWardNumber());
						System.out.println("ward corporator name is : " +ref.getCorporatorName());
						System.out.println("    ");
					}
				}
			}
			if(start==false) {
				System.out.println("ward is not found");
			}
		}
	}

}
