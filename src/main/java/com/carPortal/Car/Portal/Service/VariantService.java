package com.carPortal.Car.Portal.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.carPortal.Car.Portal.Entity.Variant;

import com.carPortal.Car.Portal.Repository.VariantRepository;

@Service
public class VariantService {
	List<Variant> list= new ArrayList<>();

	@Autowired
	VariantRepository variantRepository;
	

	public List<Variant> getAllVariant() {
		 return variantRepository.findAll();
	
	}


	public Optional<Variant> getById(int id) {
		return variantRepository.findById(id);
	}


	public Variant addVariant(Variant variant) {
		
		return variantRepository.save(variant);
	}


	public Variant variantUpdate(Variant variant, int id) {
		list= new ArrayList<Variant>(variantRepository.findAll());
		for(Variant b:list) {
			if(b.getId()==id) {
		       variantRepository.save(variant);
				}
			}
		
		return variant;
	}


	public void deleteById(int id) {
		variantRepository.deleteById(id);
		
	}

}
