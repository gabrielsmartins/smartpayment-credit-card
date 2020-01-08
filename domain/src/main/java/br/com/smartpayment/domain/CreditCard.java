package br.com.smartpayment.domain;

public class CreditCard {

	private Long id;
	private BrandEnum brand;
	private String number;
	
	public CreditCard(String number, BrandEnum brand) {
		this.number = number;
		this.brand = brand;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BrandEnum getBrand() {
		return brand;
	}
	public void setBrand(BrandEnum brand) {
		this.brand = brand;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
