package com.addressbookapp.service;

import com.addressbookapp.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookDBServiceTest {

    @Test
    public void givenDatabaseContacts_WhenRetrieved_ShouldReturnContactList() {
        AddressBookDBService dbService = new AddressBookDBService();

        List<Contact> contactList = dbService.getAllContactsFromDB();

        Assertions.assertNotNull(contactList);
        Assertions.assertTrue(contactList.size() > 0);
    }
}