package br.com.smartpayment.adapter.web.controller;

import br.com.smartpayment.adapter.web.dto.CreditCardResponseDto;
import br.com.smartpayment.adapter.web.mapper.CreditCardWebMapper;
import br.com.smartpayment.adapter.web.service.CreditCardService;
import br.com.smartpayment.domain.CreditCard;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("cards")
@AllArgsConstructor
public class CreditCardController {

	private final CreditCardService creditCardService;
	private final CreditCardWebMapper mapper;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		Optional<CreditCard> optional = creditCardService.findById(id);
		if(optional.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		CreditCardResponseDto creditCardResponseDto = mapper.mapToDto(optional.get());
		return new ResponseEntity<CreditCardResponseDto>(creditCardResponseDto, HttpStatus.OK);
	}

}
