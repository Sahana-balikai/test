package com.sahana.car.service;

import com.sahana.car.dto.CarDTO;

public interface CarService {
	boolean ValidateAndSave(CarDTO cardto);
	void deleteByCarName(String CarName);
	

}
