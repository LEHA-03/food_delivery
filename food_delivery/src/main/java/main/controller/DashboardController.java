package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.OfferDTO;
import main.service.OfferService;

@RestController("/offers")
public class DashboardController {

	
	@Autowired
	private OfferService offersService;
	
	
	@GetMapping()
	public ResponseEntity<List<OfferDTO>> getAllOffers() {
	    List<OfferDTO> offers = offersService.findAll();
	    return ResponseEntity.ok(offers);
	}
}
