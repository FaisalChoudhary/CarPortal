package com.carPortal.Car.Portal.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carPortal.Car.Portal.Dto.VehiclebyModel;
import com.carPortal.Car.Portal.Entity.Brand;
import com.carPortal.Car.Portal.Entity.Vehical;
import com.carPortal.Car.Portal.Repository.VehicalRepository;
import com.carPortal.Car.Portal.Service.VehicleService;

import ch.qos.logback.classic.Logger;

@RestController
public class VehicalController {
	
	
	org.slf4j.Logger logger=LoggerFactory.getLogger(VehicalController.class);
	
	@Autowired
	VehicalRepository vehicalRepository;
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/Vehicles")
	public List<Vehical> getAll(){
		logger.info("All data had fetched");

		return vehicleService.getallVehicles();
		
		
		
	}
	
	@GetMapping("/Vehicles/{id}")
	public Optional<Vehical> findById(@PathVariable int id){
	    logger.error("Fatal error");
	    return vehicleService.vehicleById(id);
	}
	
	@PostMapping("/Create/Vehicle")
	public Vehical save(@RequestBody Vehical vehical) {
		
		return vehicleService.addVehicle(vehical);
		
	}
	
	@PutMapping("/updatevehicles/{id}")
	public Vehical update(@RequestBody Vehical vehical,@PathVariable int id) {
	 return  vehicleService.update(vehical,id);
	
	}
	
	
	
	
	@DeleteMapping("/Vehicles/{id}")
	public void delete(@PathVariable int id) {
		vehicleService.deleteById(id);
		
	}
	
	
	
	@GetMapping("/brandbyvehicle/{vehicleId}")
    public Brand getBrandByVehicleId(@PathVariable int vehicleId){
		
		return vehicleService.getBrandByVehicleId(vehicleId);	
	
	
	}	
	
	
	
	@GetMapping("/getdata/from/third-party")
    public String getDataFromThirdParty(){
		
		return vehicleService.getDataBYAnotherAPI();	
	
	
	}	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/vehicles/model/{model}/{year}")
//	public VehiclebyModel getVehicleByModel(@PathVariable String model,@PathVariable String year) {
//		return vehicleService.vehicleByModel(model,year);
//		
//	}
	
	
	
//	@GetMapping("/vehicles/model/{model}")
//	public VehiclebyModel getVehicleByModel(@PathVariable String model) {
//		return vehicleService.vehicleByModel(model);
//		
//	}

}


