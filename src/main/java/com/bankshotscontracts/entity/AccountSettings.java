package com.bankshotscontracts.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "accountSettings")
public class AccountSettings {
	
	@Id
	private ObjectId id;
	private String email;
	private String password;
	private LocalDate dateCreated;
	private LocalDateTime lastActive;
	private LocalDateTime lastUpdate;
	private String role;
	private boolean online; 
	private AccountSettings accountSettings;

}
