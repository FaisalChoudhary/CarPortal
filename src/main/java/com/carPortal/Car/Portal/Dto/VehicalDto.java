package com.carPortal.Car.Portal.Dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.carPortal.Car.Portal.Entity.Vehical;

public class VehicalDto {
	@Autowired
	List<Vehical> vehicel;

	public List<Vehical> getVehicel() {
		return vehicel;
	}

	public void setVehicel(List<Vehical> list) {
		this.vehicel = list;
	}

	@Override
	public String toString() {
		return "VehicalDto [vehicel=" + vehicel + "]";
	}

	public VehicalDto(List<Vehical> vehicel) {
		super();
		this.vehicel = vehicel;
	}

	public VehicalDto() {
		super();
	}
	
	
}
