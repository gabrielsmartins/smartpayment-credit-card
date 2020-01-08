package br.com.smartpayment.adapter.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.smartpayment.adapter.data.entity.CreditCardEntity;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity,Long> {

	Optional<CreditCardEntity> findByNumber(String number);

}
