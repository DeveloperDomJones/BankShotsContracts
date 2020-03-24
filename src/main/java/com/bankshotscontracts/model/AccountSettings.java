package com.bankshotscontracts.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AccountSettings {
	
	private String firstName;
	private String lastName;
	private String occupation;
	private String city;
	private String state;
	private String country;
	private String birthday;
	private String email;
	private LocalDate dateCreated;
	private LocalDateTime lastActive;
	private LocalDateTime lastUpdate;
	private boolean online; 
	private String role;
	private boolean accountsOwner;

}

