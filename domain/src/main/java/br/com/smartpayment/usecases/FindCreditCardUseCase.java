package br.com.smartpayment.usecases;

import br.com.smartpayment.domain.CreditCard;

import java.util.Optional;

public interface FindCreditCardUseCase {

	Optional<CreditCard> findByNumber(String number);

	Optional<CreditCard> findById(Long id);
	
}
