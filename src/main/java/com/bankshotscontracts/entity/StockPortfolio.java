package com.bankshotscontracts.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "stockPortfolio")
public class StockPortfolio {
	
	private String symbol;
	private double holdings;

}
