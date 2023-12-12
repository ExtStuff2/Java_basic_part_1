package hw10.phonebook;

import java.util.Collection;

public interface PhoneBookApi {
    void createContact(Contact contact);

    Collection getAllContacts();

    Contact getContact(String contactName);

    void updateContact(Contact contact);

    void deleteContact(Contact contact);

}
