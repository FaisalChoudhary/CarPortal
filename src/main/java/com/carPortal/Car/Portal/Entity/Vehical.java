package com.carPortal.Car.Portal.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Vehical {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vin;
	private String chasisNo;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="brand_id" , nullable= false)
			private Brand brand;
	  @ManyToOne( optional = false)
	    @JoinColumn(name = "model_id", nullable = false)
	    private Model model;
	
	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="variant_fk" , referencedColumnName= "id")
			private Variant variant;
	
	
	
	 @JsonBackReference
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	  @JsonBackReference
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Variant getVariant() {
		return variant;
	}
	public void setVariant(Variant variant) {
		this.variant = variant;
	}


	public Vehical(int id, String vin, String chasisNo) {
		super();
		this.id = id;
		this.vin = vin;
		this.chasisNo = chasisNo;
	}
	public Vehical() {
		super();
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

	@Override
	public String toString() {
		return "Vehical [id=" + id + ", vin=" + vin + ", chasisNo=" + chasisNo + ", brand=" + brand + ", model=" + model
				+ ", variant=" + variant + "]";
	}


	
	

}
