package br.com.smartpayment.adapter.web.service;

import org.springframework.stereotype.Service;

import br.com.smartpayment.domain.CreditCard;
import br.com.smartpayment.usecases.FindCreditCardUseCase;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditCardService {
	
	private final FindCreditCardUseCase findCreditCardUseCase;
	
	public Optional<CreditCard> findById(Long id) {
		return findCreditCardUseCase.findById(id);
	}

}
