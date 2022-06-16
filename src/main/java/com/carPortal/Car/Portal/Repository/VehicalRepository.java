package com.carPortal.Car.Portal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carPortal.Car.Portal.Dto.VehiclebyModel;
import com.carPortal.Car.Portal.Entity.Vehical;

public interface VehicalRepository extends JpaRepository<Vehical,Integer> {
	
	@Query("Select new com.carPortal.Car.Portal.Dto.VehiclebyModel(m.model, v.id, v.vin, v.chasisNo ,m.year) FROM Vehical v JOIN v.model m")
	public List<VehiclebyModel> getVehicalByModel();




}
