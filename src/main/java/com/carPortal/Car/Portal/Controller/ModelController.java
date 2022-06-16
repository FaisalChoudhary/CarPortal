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


import com.carPortal.Car.Portal.Entity.Model;
import com.carPortal.Car.Portal.Entity.Vehical;
import com.carPortal.Car.Portal.Repository.ModelRepository;
import com.carPortal.Car.Portal.Service.ModelService;

@RestController
public class ModelController {
	@Autowired
    ModelRepository modelRepository;
	@Autowired
	ModelService modelService;
	
	@GetMapping("/Models")
	public List<Model> getAllBrand() {
		return modelService.getAllModel();
		
	}
	
	@GetMapping("/ModelById/{id}")
	public Optional<Model> getById(@PathVariable int id) {
		return modelService.getById(id);
	}
	
	@PostMapping("/AddModel")
	public Model addModel(@RequestBody Model model) {
		return modelService.addModel(model);
		
	}
	
	@PutMapping("/updateModel/{id}")
	public Model modelUpdate(@RequestBody Model model,@PathVariable int id) {
		return modelService.modelUpdate(model,id);
		
	}
	
	@DeleteMapping("/Model/{id}")
	public void deleteById(@PathVariable int id) {
		modelService.deleteById(id);
	}
	
	
	@GetMapping("/vehicle/{model}")
	public List<Vehical> getVehicleByModel(@PathVariable String model){
		
		return modelService.getVehicleByModel(model);
		
	}

}
