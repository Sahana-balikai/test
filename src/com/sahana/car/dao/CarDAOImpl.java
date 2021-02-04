package com.sahana.car.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sahana.car.dto.CarDTO;

public class CarDAOImpl implements CarDAO {

	private List<CarDTO> database;
	
	public CarDAOImpl() {
		this.database=new ArrayList<CarDTO>();
	}
	

	@Override
	public boolean save(CarDTO dto) {
		boolean added = false;
		System.out.println("invoked save method");
		if (!this.database.contains(dto)) {
			added = this.database.add(dto);
		}
		if (added) {
			System.out.println("car added" + dto);
			return true;
		} else {
			System.out.println("car not added");
		}

		return false;
	}

	@Override
	public boolean updateByCarName(String CarName, String CarModel, int noOfCars) {
		System.out.println("invoked update by brand");
		Iterator<CarDTO> iterator = this.database.iterator();
		while (iterator.hasNext()) {
			CarDTO dto = iterator.next();
			if (dto.getCarName().equals(CarName)) {
				System.out.println("carname found,we can update ");
				dto.setCarName(CarName);
				System.out.println("updated car name" + dto);
				return true;
			} else {
				System.out.println("cannot update car name");
				break;
			}
		}

		return false;
	}

	@Override
	public boolean deleteByCarName(String CarName) {
		System.out.println("invoked delete by brand");
		Iterator<CarDTO> iterator = this.database.iterator();
		while (iterator.hasNext()) {
			CarDTO dto = iterator.next();
			if (dto.getCarName().equals(CarName)) {
				System.out.println("carname is found,we can delete");
				iterator.remove();
				System.out.println("car is deleted");
				return true;
			} else {
				System.out.println("car is not deleted");
			}
		}

		return false;
	}

	@Override
	public List<CarDTO> getall() {
		System.out.println("invoked get all ");
		return this.database;
	}

}
