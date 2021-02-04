package com.sahana.car;

import com.sahana.car.dao.CarDAO;
import com.sahana.car.dao.CarDAOImpl;
import com.sahana.car.dto.CarDTO;

public class CarTester {
	public static void main(String[] args) {
		CarDTO cardto=new CarDTO();
		cardto.setCarName("Ford");
		cardto.setCarModel("mustang");
		cardto.setNoOfCars(3);
		
		
		CarDAO cardao=new CarDAOImpl();
		cardao.save(cardto);
		
		CarDTO cardto1=new CarDTO();
		cardto1.setCarName("maruti");
		cardto1.setCarModel("breeza");
		cardto1.setNoOfCars(4);
		
		CarDAO cardao1=new CarDAOImpl();
		cardao1.save(cardto1);
		cardao1.deleteByCarName("maruti");
		
		
	}
	

}
