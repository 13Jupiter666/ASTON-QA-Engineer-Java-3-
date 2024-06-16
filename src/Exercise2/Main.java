package Exercise2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "8-999-456-7890");
        phoneBook.add("Aleksei", "8-989-567-8901");
        phoneBook.add("Ivan", "8-921-678-9012");
        phoneBook.add("German", "8-919-789-0123");
        phoneBook.add("Levan", "8-962-890-1234");

        System.out.println("Ivan's numbers: " + phoneBook.get("Ivan"));
        System.out.println("Aleksei's numbers: " + phoneBook.get("Aleksei"));
        System.out.println("German's numbers: " + phoneBook.get("German"));
        System.out.println("Andrei's numbers: " + phoneBook.get("Andrei"));
        System.out.println("Levan's numbers: " + phoneBook.get("Levan"));
    }
}