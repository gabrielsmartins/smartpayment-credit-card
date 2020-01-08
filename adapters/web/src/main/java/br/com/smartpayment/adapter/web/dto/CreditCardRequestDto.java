package br.com.smartpayment.adapter.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardRequestDto {
	
	@NonNull
	@JsonProperty("number")
	private String number;
	
	@NonNull
	@JsonProperty("brand")
	private String brand;
}
