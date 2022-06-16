package com.carPortal.Car.Portal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.carPortal.Car.Portal.Entity.Variant;

import com.carPortal.Car.Portal.Repository.VariantRepository;

import com.carPortal.Car.Portal.Service.VariantService;

@RestController
public class VariantController {
	

	@Autowired
	VariantService variantService;
	
	@GetMapping("/Variants")
	public List<Variant> getAllBrand() {
		return variantService.getAllVariant();
		
	}
	
	@GetMapping("/VariantById/{id}")
	public Optional<Variant> getById(@PathVariable int id) {
		return variantService.getById(id);
	}
	
	@PostMapping("/AddVariant")
	public Variant addVariant(@RequestBody Variant variant) {
		return variantService.addVariant(variant);
		
	}
	
	@PutMapping("/updateVariant/{id}")
	public Variant variantUpdate(@RequestBody Variant variant,@PathVariable int id) {
		return variantService.variantUpdate(variant,id);
		
	}
	
	@DeleteMapping("/Variant/{id}")
	public void deleteById(@PathVariable int id) {
		variantService.deleteById(id);
	}
	


}
