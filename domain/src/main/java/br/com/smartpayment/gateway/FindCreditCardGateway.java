package br.com.smartpayment.gateway;

import br.com.smartpayment.domain.CreditCard;

import java.util.Optional;

public interface FindCreditCardGateway {
	
	Optional<CreditCard> findById(Long id);
	
	Optional<CreditCard> findByNumber(String number);

}
