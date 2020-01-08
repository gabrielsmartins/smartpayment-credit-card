package br.com.smartpayment.adapter.web.mapper;

import org.springframework.stereotype.Component;

import br.com.smartpayment.adapter.web.dto.CreditCardRequestDto;
import br.com.smartpayment.adapter.web.dto.CreditCardResponseDto;
import br.com.smartpayment.domain.BrandEnum;
import br.com.smartpayment.domain.CreditCard;

@Component
public class CreditCardWebMapper {
	
	public CreditCard mapToDomain(CreditCardRequestDto creditCardRequestDto) {
		return new CreditCard(creditCardRequestDto.getNumber(), BrandEnum.valueOf(creditCardRequestDto.getBrand()));
	}
	
	
	public CreditCardResponseDto mapToDto(CreditCard creditCard) {
		CreditCardResponseDto creditCardResponseDto = new CreditCardResponseDto(creditCard.getNumber(), creditCard.getBrand().toString());
		creditCardResponseDto.setId(creditCard.getId());
		return creditCardResponseDto;
	}

}
