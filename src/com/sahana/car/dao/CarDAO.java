package com.sahana.car.dao;

import java.util.List;

import com.sahana.car.dto.CarDTO;

public interface CarDAO {
	boolean save(CarDTO dto);

	boolean updateByCarName(String CarName,String CarModel,int noOfCars);
	boolean deleteByCarName(String CarName);
	List<CarDTO>getall();
	

}
