package com.carPortal.Car.Portal.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carPortal.Car.Portal.Dto.VehiclebyModel;
import com.carPortal.Car.Portal.Entity.Model;
import com.carPortal.Car.Portal.Entity.Vehical;
import com.carPortal.Car.Portal.Repository.ModelRepository;

@Service
public class ModelService {
	List<Model> list= new ArrayList<>();

	@Autowired
	ModelRepository modelRepository;
	
	
	

	public List<Model> getAllModel() {
		 return modelRepository.findAll();
	
	}


	public Optional<Model> getById(int id) {
		return modelRepository.findById(id);
	}


	public Model addModel(Model model) {
		
		return modelRepository.save(model);
	}


	public Model modelUpdate(Model model, int id) {
		list= new ArrayList<Model>(modelRepository.findAll());
		for(Model b:list) {
			if(b.getId()==id) {
		        modelRepository.save(model);
				}
			}
		
		return model;
	}


	public void deleteById(int id) {
		modelRepository.deleteById(id);
		
	}


	public List<Vehical> getVehicleByModel(String model) {
		List<Model> list= new ArrayList<Model>(modelRepository.findAll());
	
		List<Vehical> v = null;
		for(Model m : list) {
			if(m.getModel().equals(model)) {
			
				v= m.getVehicles();
				
			}
			
		}
		System.out.println(v);
		return v; 
	}
	
	

}
