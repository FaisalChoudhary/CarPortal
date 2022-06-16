package com.carPortal.Car.Portal.Dto;


public class VehiclebyModel {
	
	private String model;
	private int id;
	private String vin;
	private String chasisNo;
	private String year;
	
	
	public VehiclebyModel(String model, int id, String vin, String chasisNo, String year) {
		super();
		this.model = model;
		this.id = id;
		this.vin = vin;
		this.chasisNo = chasisNo;
		this.year = year;
	}


	public VehiclebyModel() {
		super();
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVin() {
		return vin;
	}


	public void setVin(String vin) {
		this.vin = vin;
	}


	public String getChasisNo() {
		return chasisNo;
	}


	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "VehiclebyModel [model=" + model + ", id=" + id + ", vin=" + vin + ", chasisNo=" + chasisNo + ", year="
				+ year + "]";
	}
	
	

}
