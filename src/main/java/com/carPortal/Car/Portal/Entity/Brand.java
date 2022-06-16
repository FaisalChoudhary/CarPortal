package com.carPortal.Car.Portal.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Brand {
	@Id
	private int id;
	private String brandName;
	private String logo;
	
	public Brand() {
		super();
	}

	public Brand(int id, String name, String logo) {
		super();
		this.id = id;
		this.brandName = name;
		this.logo = logo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return brandName;
	}

	public void setName(String name) {
		this.brandName = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + brandName + ", logo=" + logo + "]";
	}
	
	
	@OneToMany(mappedBy = "brand", cascade = {
	        CascadeType.ALL
	    })
	    private List < Vehical > vehicles;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	 @JsonManagedReference
	public List<Vehical> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehical> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	}
