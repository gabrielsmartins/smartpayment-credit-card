package br.com.smartpayment.adapter.data.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.smartpayment.adapter.data.entity.CreditCardEntity;
import br.com.smartpayment.adapter.data.mapper.CreditCardDataMapper;
import br.com.smartpayment.adapter.data.repository.CreditCardRepository;
import br.com.smartpayment.domain.CreditCard;
import br.com.smartpayment.gateway.FindCreditCardGateway;

@Component
public class CreditCardPersistenceAdapter implements FindCreditCardGateway {
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	@Autowired
	private CreditCardDataMapper mapper;

	@Override
	public CreditCard findById(Long id) {
		Optional<CreditCardEntity> optionalCreditCard = creditCardRepository.findById(id);
		if (optionalCreditCard.isEmpty())
			return mapper.mapToDomain(optionalCreditCard.get());
		return null;
	}

	@Override
	public CreditCard findByNumber(String number) {
		Optional<CreditCardEntity> optionalCreditCard = creditCardRepository.findByNumber(number);
		if (optionalCreditCard.isEmpty())
			return mapper.mapToDomain(optionalCreditCard.get());
		return null;
	}

}
