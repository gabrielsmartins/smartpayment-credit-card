package br.com.smartpayment.adapter.data.adapter;

import br.com.smartpayment.adapter.data.entity.CreditCardEntity;
import br.com.smartpayment.adapter.data.mapper.CreditCardDataMapper;
import br.com.smartpayment.adapter.data.repository.CreditCardRepository;
import br.com.smartpayment.domain.CreditCard;
import br.com.smartpayment.gateway.FindCreditCardGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CreditCardPersistenceAdapter implements FindCreditCardGateway {

	private final CreditCardRepository repository;
	private final CreditCardDataMapper mapper;

	@Override
	public Optional<CreditCard> findById(Long id) {
		Optional<CreditCardEntity> optionalCreditCard = repository.findById(id);
		if (!optionalCreditCard.isEmpty())
			return Optional.ofNullable(mapper.mapToDomain(optionalCreditCard.get()));
		return Optional.empty();
	}

	@Override
	public Optional<CreditCard> findByNumber(String number) {
		Optional<CreditCardEntity> optionalCreditCard = repository.findByNumber(number);
		if (!optionalCreditCard.isEmpty())
			return Optional.ofNullable(mapper.mapToDomain(optionalCreditCard.get()));
		return Optional.empty();
	}

}
