package br.com.smartpayment.usecases;

import br.com.smartpayment.domain.CreditCard;

public interface FindCreditCardUseCase {

	public CreditCard findByNumber(String number);
	
	public CreditCard findById(Long id);
	
}
