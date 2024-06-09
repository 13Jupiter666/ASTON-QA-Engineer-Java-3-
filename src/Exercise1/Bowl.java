package Exercise1;


class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        if (foodAmount < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = foodAmount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (amount > foodAmount) {
            foodAmount = 0;
        } else {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}