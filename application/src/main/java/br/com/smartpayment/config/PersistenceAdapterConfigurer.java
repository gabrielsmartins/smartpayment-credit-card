package br.com.smartpayment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.smartpayment.adapter.data.adapter.CreditCardPersistenceAdapter;

@Configuration
public class PersistenceAdapterConfigurer {

	@Bean
	public CreditCardPersistenceAdapter creditCardPersistenceAdapter() {
		return new CreditCardPersistenceAdapter();
	}
}
