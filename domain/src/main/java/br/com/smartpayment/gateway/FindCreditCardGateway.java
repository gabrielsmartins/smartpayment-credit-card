package br.com.smartpayment.gateway;

import br.com.smartpayment.domain.CreditCard;

public interface FindCreditCardGateway {
	
	public CreditCard findById(Long id);
	
	public CreditCard findByNumber(String number);

}
