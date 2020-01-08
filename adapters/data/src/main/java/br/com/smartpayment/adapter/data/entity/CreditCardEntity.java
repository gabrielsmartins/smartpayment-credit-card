package br.com.smartpayment.adapter.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.smartpayment.domain.BrandEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "credit_card")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CreditCardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@NonNull
	@Column(name="number")
	private String number;
	
	@NonNull
	@Column(name="brand")
	@Enumerated
	private BrandEnum brand;
	
	
	
}
