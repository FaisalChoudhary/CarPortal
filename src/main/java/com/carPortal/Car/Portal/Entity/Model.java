package com.carPortal.Car.Portal.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Model {
	
	@Id
	private int id;
	private String model;
	private String year;
	public Model() {
		super();
	}
	public Model(int id, String model, String year) {
		super();
		this.id = id;
		this.model = model;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@OneToMany(mappedBy = "model", cascade = {
	        CascadeType.ALL
	    })
	    private List < Vehical > vehicles;
	
	 @JsonManagedReference
	public List<Vehical> getVehicles() {
		return vehicles;
	}
//	public void setVehicles(List<Vehical> vehicles) {
//		this.vehicles = vehicles;
//	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", model=" + model + ", year=" + year + "]";
	}
	
	
	
	

}
