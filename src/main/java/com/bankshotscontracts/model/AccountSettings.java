package com.bankshotscontracts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountSettings {
	
	private String firstName;
	private String lastName;
	private String occupation;
	private String city;
	private String state;
	private String country;
	private String birthday;
	private String email;
//	private LocalDate dateCreated;
//	private LocalDateTime lastActive;
//	private LocalDateTime lastUpdate;
	private boolean online; 
	private String role;
	private boolean accountsOwner;

}

