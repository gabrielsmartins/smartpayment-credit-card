package br.com.smartpayment.adapter.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CreditCardResponseDto {
	
	@JsonProperty("id")
	private Long id;
	
	@NonNull
	@JsonProperty("number")
	private String number;
	
	@NonNull
	@JsonProperty("brand")
	private String brand;

}
