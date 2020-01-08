package br.com.smartpayment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.smartpayment.adapter.data.mapper.CreditCardDataMapper;

@Configuration
public class CreditCardDataMapperConfigurer {

	@Bean
	public CreditCardDataMapper creditCardDataMapper() {
		return new CreditCardDataMapper();
	}
}
