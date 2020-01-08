package br.com.smartpayment.service;

import br.com.smartpayment.domain.CreditCard;
import br.com.smartpayment.gateway.FindCreditCardGateway;
import br.com.smartpayment.usecases.FindCreditCardUseCase;

public class FindCreditCardService implements FindCreditCardUseCase{

	private FindCreditCardGateway gateway;
	
	public FindCreditCardService(FindCreditCardGateway gateway) {
		this.gateway = gateway;
	}
	
	public CreditCard findByNumber(String number) {
		return this.gateway.findByNumber(number);
	}
	
	public CreditCard findById(Long id) {
		return this.gateway.findById(id);
	}
}
