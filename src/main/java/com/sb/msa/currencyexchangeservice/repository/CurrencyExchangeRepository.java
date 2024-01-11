package com.sb.msa.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.msa.currencyexchangeservice.currencyexchange.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByCurrencyfromAndCurrencyto(String currencyFrom, String currencyTo);
}