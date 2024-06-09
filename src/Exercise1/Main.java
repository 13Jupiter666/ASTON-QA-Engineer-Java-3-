package Exercise1;


public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        dogBobik.run(150);
        dogBobik.swim(8);

        catMurzik.run(150);
        catMurzik.swim(8);

        Cat[] cats = {new Cat("Барсик"), new Cat("Василий"), new Cat("Мурка")};
        Bowl bowl = new Bowl(25);

        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 10);
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}