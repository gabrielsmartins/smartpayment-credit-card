package br.com.smartpayment.adapter.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.smartpayment.adapter.web.dto.CreditCardResponseDto;
import br.com.smartpayment.adapter.web.mapper.CreditCardWebMapper;
import br.com.smartpayment.adapter.web.service.CreditCardService;
import br.com.smartpayment.domain.CreditCard;

@RestController
@RequestMapping("cards")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@Autowired
	private CreditCardWebMapper mapper;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		CreditCard creditCard = creditCardService.findById(id);
		CreditCardResponseDto creditCardResponseDto = mapper.mapToDto(creditCard);
		return new ResponseEntity<CreditCardResponseDto>(creditCardResponseDto, HttpStatus.OK);
	}

}
