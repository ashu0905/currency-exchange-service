package com.sb.msa.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sb.msa.currencyexchangeservice.currencyexchange.CurrencyExchange;
import com.sb.msa.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	
	@Autowired
	CurrencyExchangeService currencyExchangeService;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ResponseEntity<CurrencyExchange> getExchange(@PathVariable("from") String from, @PathVariable("to") String to) {
		CurrencyExchange currencyExchange = new CurrencyExchange();
		currencyExchange.setEnv(env.getProperty("local.server.port"));
		System.out.println("port = " + env.getProperty("local.server.port"));
		currencyExchange = currencyExchangeService.getCurrencyExchange(from, to);
		currencyExchange.setEnv(env.getProperty("local.server.port"));
		if(currencyExchange == null)
			throw new RuntimeException("Currency exchange not found for: " + from + " to: " + to);
		return new ResponseEntity<>(currencyExchange, HttpStatus.OK);
	}
}