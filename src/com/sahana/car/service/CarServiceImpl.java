package com.sahana.car.service;

import com.sahana.car.dao.CarDAO;
import com.sahana.car.dto.CarDTO;

public class CarServiceImpl implements CarService {

	private CarDAO cardao;

	public CarServiceImpl(CarDAO dao) {
		System.out.println("invoked car service implementor");
		this.cardao = dao;

	}

	@Override
	public boolean ValidateAndSave(CarDTO cardto) {
		boolean validData = false;
		if (cardto != null) {
			System.out.println("dto is not null can save the fields");
			String CarName=cardto.getCarName();
			if(CarName!=null && CarName.length()>=3 &&!CarName.isEmpty() &&CarName.contains("")) {
				System.out.println("car name is valid");
				validData=true;
			}
			else {
				System.out.println("car name is invalid");
				validData=false;
			}
			

			if (validData) {
				String CarModel = cardto.getCarModel();
				if (CarModel != null) {
					System.out.println("car model is valid");
					validData = true;
				} else {
					System.out.println("car model is invalid");
					validData = false;
				}
			}

			if (validData) {
				int noOfCars = cardto.getNoOfCars();
				if (noOfCars != 0 && noOfCars < 1000000000) {
					System.out.println("no of cars is valid");
					validData = true;
				} else {
					System.out.println("no of cars is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("All data valid");
				cardao.save(cardto);
				validData=true;
			}

		} else {
			System.out.println("dto is null cannot save fields");
		}

		return false;
	}

	@Override
	public void deleteByCarName(String CarName) {
		System.out.println("invoked deletebycarname");
		if (CarName != null && !CarName.isEmpty() && !CarName.contains("") && CarName.length() >= 3) {
			System.out.println("car name is valid,can delete" + CarName);
			this.cardao.deleteByCarName(CarName);
		} else {
			System.out.println("invalid car name");
		}

	}

}
