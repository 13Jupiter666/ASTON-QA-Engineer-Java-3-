package Exercise2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        if (phoneBook.add("8-999-456-7890", "Ivanov")) {
            System.out.println("Added Ivanov's number: 8-999-456-7890");
        } else {
            System.out.println("Ivanov's number 8-999-456-7890 already exists");
        }

        if (phoneBook.add("8-989-567-8901", "Alekseev")) {
            System.out.println("Added Alekseev's number: 8-989-567-8901");
        } else {
            System.out.println("Aleksev's number 8-989-567-8901 already exists");
        }

        if (phoneBook.add("8-921-678-9012", "Ivanov")) {
            System.out.println("Added Ivanov's number: 8-921-678-9012");
        } else {
            System.out.println("Ivanov's number 8-921-678-9012 already exists");
        }

        if (phoneBook.add("8-919-789-0123", "Germanskiy")) {
            System.out.println("Added Germanskiy's number: 8-919-789-0123");
        } else {
            System.out.println("Germanskiy's number 8-919-789-0123 already exists");
        }

        if (phoneBook.add("8-962-890-1234", "Levanov")) {
            System.out.println("Added Levanov's number: 8-962-890-1234");
        } else {
            System.out.println("Levanov's number 8-962-890-1234 already exists");
        }

        if (phoneBook.add("8-999-456-7890", "Ivanov")) {
            System.out.println("Added Ivanov's number: 8-999-456-7890");
        } else {
            System.out.println("Ivanov's number 8-999-456-7890 already exists");
        }

        System.out.println("Ivanov's numbers: " + phoneBook.getPhoneNumbersBySurname("Ivanov"));
        System.out.println("Alekseev's numbers: " + phoneBook.getPhoneNumbersBySurname("Alekseev"));
        System.out.println("Germanskiy's numbers: " + phoneBook.getPhoneNumbersBySurname("Germanskiy"));
        System.out.println("Andreev's numbers: " + phoneBook.getPhoneNumbersBySurname("Andreev"));
        System.out.println("Levanov's numbers: " + phoneBook.getPhoneNumbersBySurname("Levanov"));
    }
}