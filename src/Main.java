public class Main {
    public static void main(String[] args) {
        //Сотрудники
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231233112", 130000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "89231236513", 250000, 40);
        employeeArray[2] = new Employee("Sidorov Anton", "Developer", "sidorov@mailbox.com", "89231234514", 270000, 35);
        employeeArray[3] = new Employee("Kuznetsov Grigoriy", "Analyst", "kuznetsov@mailbox.com", "89231268315", 240000, 28);
        employeeArray[4] = new Employee("Smirnov Oleg", "Tester", "smirnov@mailbox.com", "89231231596", 145000, 32);

        for (Employee employee : employeeArray) {
            employee.printInfo();
            System.out.println();
        }
        // Парк
        Park park = new Park();

        park.addAttraction("Roller Coaster", "10:00 - 18:00", 500);
        park.addAttraction("Ferris Wheel", "19:00 - 21:00", 300);
        park.addAttraction("Haunted House", "11:00 - 20:00", 400);


        park.printAttractions();
        }
    }