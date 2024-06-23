package Exercise2;
import java.util.*;

public class PhoneBook {
    private final Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public boolean add(String phoneNumber, String surname) {
        if (this.phoneBook.containsKey(phoneNumber)) {
            return false;
        }
        this.phoneBook.put(phoneNumber, surname);
        return true;
    }

    public String get(String phoneNumber) {
        return this.phoneBook.getOrDefault(phoneNumber, "Не найдено");
    }

    public List<String> getPhoneNumbersBySurname(String surname) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(surname)) {
                phoneNumbers.add(entry.getKey());
            }
        }
        return phoneNumbers;
    }

    public boolean remove(String phoneNumber) {
        return this.phoneBook.remove(phoneNumber) != null;
    }
}