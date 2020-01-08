package br.com.smartpayment.domain;

public enum BrandEnum {
	
	VISA(1),
	MASTERCARD(2),
	AMEX(3),
	DINERS(4),
	HIPERCARD(5),
	ELO(6);
	
	private Integer code;
	
	private BrandEnum(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
}
