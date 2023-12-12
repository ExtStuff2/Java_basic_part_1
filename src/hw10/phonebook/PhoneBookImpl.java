package hw10.phonebook;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class PhoneBookImpl implements PhoneBookApi {

    private HashMap<UUID, Contact> contactHashMap = PhoneBookRepository.getContactHashMap();

    @Override
    public void createContact(Contact contact) {
        contactHashMap.put(contact.getId(), contact);
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return contactHashMap.values();
    }

    @Override
    public Contact getContact(String contactName) {
        for (Contact contact : getAllContacts()) {
            if (Objects.equals(contact.getContactName(), contactName))
                return contact;
        }
        return null;
    }

    @Override
    public void updateContact(Contact contact) {
        contactHashMap.put(contact.getId(), contact);

    }

    @Override
    public void deleteContact(Contact contact) {
        contactHashMap.remove(contact.getId());
    }
}
