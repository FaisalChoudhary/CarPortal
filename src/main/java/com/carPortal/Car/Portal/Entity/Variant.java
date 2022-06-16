package com.carPortal.Car.Portal.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Variant {
	
	@Id
	private int id;
	private String variant;
	public Variant() {
		super();
	}
	public Variant(int id, String variant) {
		super();
		this.id = id;
		this.variant = variant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	@Override
	public String toString() {
		return "Variant [id=" + id + ", variant=" + variant + "]";
	}
	

}
