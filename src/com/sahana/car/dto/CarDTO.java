package com.sahana.car.dto;

public class CarDTO {
	private String CarName;
	private String CarModel;
	private int noOfCars;

	public CarDTO() {
		System.out.println("invoked CarDTO constructor");
	}

	public CarDTO(String carName, String carModel, int noOfCars) {
		super();
		CarName = carName;
		CarModel = carModel;
		this.noOfCars = noOfCars;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}

	@Override
	public String toString() {
		return "CarDTO [CarName=" + CarName + ", CarModel=" + CarModel + ", noOfCars=" + noOfCars + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj != null) {
			if (obj instanceof CarDTO) {
				CarDTO dto = (CarDTO) obj;
				if (dto.getCarName() != null && dto.getCarModel() != null && dto.getNoOfCars() != 0) {
					System.out.println("Checked for null,dto is not null");
					return true;
				}
			}
		}
		System.out.println("dto is null");
		return false;
	}

}
