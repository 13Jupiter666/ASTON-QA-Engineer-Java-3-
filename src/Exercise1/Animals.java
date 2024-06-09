package Exercise1;


abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected boolean isSatiety;

    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.isSatiety = false;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void eatFromBowl(Bowl bowl, int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println(name + " не может съесть отрицательное количество еды.");
            return;
        }

        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            isSatiety = true;
            System.out.println(name + " покушал и стал сытым.");
        } else {
            System.out.println(name + " не покушал, еды не хватило.");
        }
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}
