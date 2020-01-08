package br.com.smartpayment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.smartpayment.gateway.FindCreditCardGateway;
import br.com.smartpayment.service.FindCreditCardService;
import br.com.smartpayment.usecases.FindCreditCardUseCase;

@Configuration
public class UseCaseConfigurer {

	@Bean
	public FindCreditCardUseCase findCreditCardUseCase(FindCreditCardGateway gateway) {
		return new FindCreditCardService(gateway);
	}
}
