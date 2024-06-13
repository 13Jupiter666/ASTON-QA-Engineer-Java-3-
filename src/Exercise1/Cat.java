package Exercise1;

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isSatiety;

    public Cat(String name) {
        super(name, 200, 0);
        this.isSatiety = false;
        catCount++;
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

    public boolean isSatiety() {
        return isSatiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}
