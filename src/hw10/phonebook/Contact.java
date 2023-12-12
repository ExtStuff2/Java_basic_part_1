package hw10.phonebook;

import java.util.UUID;

public class Contact {
    private UUID id;
    private String phoneNumber;
    private String contactName;

    public Contact(String phoneNumber, String contactName) {
        this.id = UUID.randomUUID();
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", phoneNumber= " + phoneNumber
                + ", contactName= " + contactName;
    }

    public UUID getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
