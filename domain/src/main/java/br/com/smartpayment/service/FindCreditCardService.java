package br.com.smartpayment.service;

import br.com.smartpayment.domain.CreditCard;
import br.com.smartpayment.gateway.FindCreditCardGateway;
import br.com.smartpayment.usecases.FindCreditCardUseCase;

import java.util.Optional;

public class FindCreditCardService implements FindCreditCardUseCase{

	private FindCreditCardGateway gateway;
	
	public FindCreditCardService(FindCreditCardGateway gateway) {
		this.gateway = gateway;
	}
	
	public Optional<CreditCard> findByNumber(String number) {
		return this.gateway.findByNumber(number);
	}
	
	public Optional<CreditCard> findById(Long id) {
		return this.gateway.findById(id);
	}
}
