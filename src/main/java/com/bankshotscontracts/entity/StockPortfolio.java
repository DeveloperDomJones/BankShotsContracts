package com.bankshotscontracts.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "stockPortfolio")
public class StockPortfolio {
	
	@Id
	private ObjectId id;
	private String symbol;
	private double holdings;
	private String accountId;

}
