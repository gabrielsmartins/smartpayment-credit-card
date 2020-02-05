package br.com.smartpayment.usecases;

import br.com.smartpayment.domain.CreditCard;

public interface SaveCreditCardUseCase {

    CreditCard save(CreditCard creditCard);
}
