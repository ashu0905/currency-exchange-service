package com.sb.msa.currencyexchangeservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.msa.currencyexchangeservice.currencyexchange.CurrencyExchange;

public interface CurrencyExchangeService {
	CurrencyExchange getCurrencyExchange(String currencyFrom, String currencyTo);
}