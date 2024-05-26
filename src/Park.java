public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int cost;

        public Attraction(String attractionName, String workingHours, int cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Wonderland");

        Park.Attraction attraction1 = park.new Attraction("Roller Coaster", "10:00 - 18:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Ferris Wheel", "09:00 - 21:00", 300);
        Park.Attraction attraction3 = park.new Attraction("Haunted House", "11:00 - 20:00", 400);

        attraction1.printInfo();
        System.out.println();
        attraction2.printInfo();
        System.out.println();
        attraction3.printInfo();
    }
}