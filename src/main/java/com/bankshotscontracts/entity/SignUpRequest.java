package com.bankshotscontracts.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.bankshotscontracts.model.AccountSettings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "accountSettings")
public class SignUpRequest {
	
	private String username;
	private String password;
	private AccountSettings accountSettings;

}
