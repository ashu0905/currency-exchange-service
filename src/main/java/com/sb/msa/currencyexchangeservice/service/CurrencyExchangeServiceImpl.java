package com.sb.msa.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.msa.currencyexchangeservice.currencyexchange.CurrencyExchange;
import com.sb.msa.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	public CurrencyExchangeServiceImpl(CurrencyExchangeRepository currencyExchangeRepository) {
		this.currencyExchangeRepository = currencyExchangeRepository;
	}

	@Override
	public CurrencyExchange getCurrencyExchange(String currencyFrom, String currencyTo) {
		return currencyExchangeRepository.findByCurrencyfromAndCurrencyto(currencyFrom, currencyTo);
	}
}