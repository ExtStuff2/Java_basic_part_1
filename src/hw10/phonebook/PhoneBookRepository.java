package hw10.phonebook;

import java.util.HashMap;
import java.util.UUID;

public class PhoneBookRepository {
    private static HashMap<UUID, Contact> contactHashMap = new HashMap<>();


    public static HashMap<UUID, Contact> getContactHashMap() {
        return contactHashMap;
    }
}
