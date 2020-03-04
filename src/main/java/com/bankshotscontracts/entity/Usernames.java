package com.bankshotscontracts.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "usernames")
public class Usernames {
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
    private long id;
	String username;

}
