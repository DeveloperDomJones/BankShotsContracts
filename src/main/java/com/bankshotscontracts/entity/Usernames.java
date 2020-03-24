package com.bankshotscontracts.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "usernames")
public class Usernames {

	@Id
	String username;

}
