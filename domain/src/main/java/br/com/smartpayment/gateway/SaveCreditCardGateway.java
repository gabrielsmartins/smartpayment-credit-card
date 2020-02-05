package br.com.smartpayment.gateway;

import br.com.smartpayment.domain.CreditCard;

public interface SaveCreditCardGateway {
    CreditCard save(CreditCard creditCard);
}
