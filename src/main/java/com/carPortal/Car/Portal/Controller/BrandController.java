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

import com.carPortal.Car.Portal.Entity.Brand;
import com.carPortal.Car.Portal.Entity.Vehical;
import com.carPortal.Car.Portal.Repository.BrandRepository;
import com.carPortal.Car.Portal.Service.BrandService;

@RestController

public class BrandController {
	@Autowired
    BrandRepository brandRepository;
	@Autowired
	BrandService brandService;
	
	@GetMapping("/Brands")
	public List<Brand> getAllBrand() {
		return brandService.getAllBrand();
		
	}
	
	@GetMapping("/BrandById/{id}")
	public Optional<Brand> getById(@PathVariable int id) {
		return brandService.getById(id);
	}
	
	@PostMapping("/AddBrand")
	public Brand addBrand(@RequestBody Brand brand) {
		return brandService.addBrand(brand);
		
	}
	
	@PutMapping("/updateBrand/{id}")
	public Brand brandUpdate(@RequestBody Brand brand,@PathVariable int id) {
		return brandService.brandUpdate(brand,id);
		
	}
	
	@DeleteMapping("/Brand/{id}")
	public void deleteById(@PathVariable int id) {
		brandService.deleteById(id);
	}
	


}
