package com.sahana.car;

import com.sahana.car.dao.CarDAO;
import com.sahana.car.dao.CarDAOImpl;
import com.sahana.car.dto.CarDTO;
import com.sahana.car.service.CarService;
import com.sahana.car.service.CarServiceImpl;

public class ValidationTester {
	public static void main(String[] args) {
		CarDTO dto=new CarDTO();
		dto.setCarName("fiat");
		dto.setCarModel("punto");
		dto.setNoOfCars(4);
		
		CarDAO dao=new CarDAOImpl();
		
		CarService service=new CarServiceImpl(dao);
		service.ValidateAndSave(dto);
		
		service.deleteByCarName("maruti");
		
		
		
	}

}
