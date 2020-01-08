package br.com.smartpayment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.smartpayment.adapter.web.mapper.CreditCardWebMapper;

@Configuration
public class CreditCardWebMapperConfigurer {

	@Bean
	public CreditCardWebMapper creditCardWebMapper() {
		return new CreditCardWebMapper();
	}
}
