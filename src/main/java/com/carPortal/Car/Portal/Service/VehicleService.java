package com.carPortal.Car.Portal.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.carPortal.Car.Portal.Entity.Brand;
//import com.carPortal.Car.Portal.Dto.VehiclebyModel;
import com.carPortal.Car.Portal.Entity.Vehical;
import com.carPortal.Car.Portal.Repository.VehicalRepository;

import ch.qos.logback.classic.Logger;

@Service
public class VehicleService {
	List<Vehical> list= new ArrayList<>();

	@Autowired
	VehicalRepository vehicalRepository;
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(VehicleService.class);
    
	
//	@Scheduled(fixedRate=1000)
//	public void addData() throws InterruptedException {
////		Thread.sleep(2000);
//		logger.info("Data is saved....");
//		
//	}
//	
//	@Scheduled(cron = "0/5 * * * * ? ")
//	public void vehicleServiceTime() {
//		logger.info("You have to take your Vehicle to Service Center");
//	}
	
	//get data by third party api
	
	public String getDataBYAnotherAPI() {
		String uri="https://fakestoreapi.com/products/";
		RestTemplate restTemplate= new RestTemplate();
		String result=restTemplate.getForObject(uri,String.class);
		return result;
	}

// Get All Data
	
	public List<Vehical> getallVehicles() {
		
		return vehicalRepository.findAll();
	}
	
	
//Get data by ID
	
	public Optional<Vehical> vehicleById(int id) {
		return vehicalRepository.findById(id);
	}

	
//ADD vehicle
	
	public Vehical addVehicle(Vehical vehical) {
		
		return vehicalRepository.save(vehical);
	}
	
//Update data
	
	public Vehical update(Vehical vehical, int id) {
		list = new ArrayList<Vehical>(vehicalRepository.findAll());
		for(Vehical v:list) {
			if(v.getId()==id) {	
			vehicalRepository.save(vehical);
			}
		}
		return vehical;
	}


// delete data
	
	public void deleteById(int id) {
		vehicalRepository.deleteById(id);
		
	}


	public Brand getBrandByVehicleId(int vehicalId) {
		List<Vehical> list1=new ArrayList<Vehical>(vehicalRepository.findAll());
		System.out.println(list1);
		Brand b = null;
		for(Vehical v: list1) {
		
			if(v.getId()==vehicalId) {
				b=v.getBrand();
				System.out.println("Yess");
				return b;
			}
		}
		return b;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public VehiclebyModel vehicleByModel(String model,String year) {
//		 list1=new ArrayList<VehiclebyModel>(vehicalRepository.getVehicalByModel());
//		 VehiclebyModel vehicleByModel = null;
//		 for(VehiclebyModel v:list1) {
//			 if(v.getModel().equals(model) && v.getYear().equals(year)) {
//				vehicleByModel=v;
//			 }
//		 }
//		 	return vehicleByModel;
//	}


	
	
	


	


 



	








}
