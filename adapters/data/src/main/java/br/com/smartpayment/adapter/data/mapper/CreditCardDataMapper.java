package br.com.smartpayment.adapter.data.mapper;

import org.springframework.stereotype.Component;

import br.com.smartpayment.adapter.data.entity.CreditCardEntity;
import br.com.smartpayment.domain.CreditCard;

@Component
public class CreditCardDataMapper {
	
	public CreditCard mapToDomain(CreditCardEntity creditCardEntity) {
		CreditCard creditCard = new CreditCard(creditCardEntity.getNumber(), creditCardEntity.getBrand());
		creditCard.setId(creditCardEntity.getId());
		return creditCard;
	}
	
	public CreditCard mapToEntity(CreditCard creditCard) {
		CreditCardEntity creditCardEntity = new CreditCardEntity(creditCard.getNumber(), creditCard.getBrand());
		creditCard.setId(creditCardEntity.getId());
		return creditCard;
	}

}
