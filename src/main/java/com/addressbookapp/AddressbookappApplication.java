package com.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addressbookapp.console.AddressBookMain;
import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBook;

@SpringBootApplication
public class AddressbookappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookappApplication.class, args);
	}

}