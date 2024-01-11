package com.sb.msa.currencyexchangeservice.currencyexchange;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="currencyexchange")
public class CurrencyExchange {
	@Id
	private int id;
	
	@Column(name="currencyfrom")
	private String currencyfrom;
	
	@Column(name="currencyto")
	private String currencyto;
	private int conversionMultiple;
	private String env;
	
	public CurrencyExchange() {
		super();
	}

	public CurrencyExchange(int id, String from, String to, int conversionMultiple) {
		super();
		this.id = id;
		this.currencyfrom = from;
		this.currencyto = to;
		this.conversionMultiple = conversionMultiple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrencyfrom() {
		return currencyfrom;
	}

	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}

	public String getCurrencyto() {
		return currencyto;
	}

	public void setCurrencyto(String currencyto) {
		this.currencyto = currencyto;
	}

	public int getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
}