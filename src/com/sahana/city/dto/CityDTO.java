package com.sahana.city.dto;

import com.sahana.city.constants.WardName;

public class CityDTO {
	private int wardNumber;
    private WardName wardName;
    private String corporatorName;
    private int population;
    private String area;
    
    public CityDTO() {
    	System.out.println("invoked citydto");
    }

	public CityDTO(int wardNumber, WardName wardName, String corporatorName, int population, String area) {
		super();
		this.wardNumber = wardNumber;
		this.wardName = wardName;
		this.corporatorName = corporatorName;
		this.population = population;
		this.area = area;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public String getCorporatorName() {
		return corporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
    
    
    

}
