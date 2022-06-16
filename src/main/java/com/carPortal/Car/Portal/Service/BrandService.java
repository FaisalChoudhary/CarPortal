package com.carPortal.Car.Portal.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carPortal.Car.Portal.Entity.Brand;

import com.carPortal.Car.Portal.Repository.BrandRepository;

@Service
public class BrandService {
	List<Brand> list= new ArrayList<>();

	@Autowired
	BrandRepository brandRepository;
	

	public List<Brand> getAllBrand() {
		 return brandRepository.findAll();
	
	}


	public Optional<Brand> getById(int id) {
		return brandRepository.findById(id);
	}


	public Brand addBrand(Brand brand) {
		
		return brandRepository.save(brand);
	}


	public Brand brandUpdate(Brand brand, int id) {
		list= new ArrayList<Brand>(brandRepository.findAll());
		for(Brand b:list) {
			if(b.getId()==id) {
		        brandRepository.save(brand);
				}
			}
		
		return brand;
	}


	public void deleteById(int id) {
		brandRepository.deleteById(id);
		
	}
    
    
//	public List<Brand> getBrandByVehicleId(int vehicleId) {
//		List<Brand> list= new ArrayList<Brand>(brandRepository.findAll());
//		for(Brand b: list) {
//			if(b.)
//		}
//		return null;
//	}
	
	
	
	

}
