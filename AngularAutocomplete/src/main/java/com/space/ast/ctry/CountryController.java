package com.space.ast.ctry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping(value="/countries", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Country>> countries(){
		Iterable<Country> countries = countryRepository.findAll();
		return new ResponseEntity<Iterable<Country>>(countries, HttpStatus.OK);
	}


}
