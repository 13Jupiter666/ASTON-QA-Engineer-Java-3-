import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, int price) {
        this.attractions.add(new Attraction(name, workingHours, price));
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println();
        }
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price);
        }
    }}