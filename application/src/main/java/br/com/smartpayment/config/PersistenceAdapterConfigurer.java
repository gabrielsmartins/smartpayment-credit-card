package br.com.smartpayment.config;

import br.com.smartpayment.adapter.data.adapter.CreditCardPersistenceAdapter;
import br.com.smartpayment.adapter.data.mapper.CreditCardDataMapper;
import br.com.smartpayment.adapter.data.repository.CreditCardRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceAdapterConfigurer {

	@Bean
	public CreditCardPersistenceAdapter creditCardPersistenceAdapter(CreditCardRepository repository, CreditCardDataMapper mapper) {
		return new CreditCardPersistenceAdapter(repository, mapper);
	}
}
