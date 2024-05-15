public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInRange(5, 6));
        printPositiveOrNegative(7);
        System.out.println(isNegative(-3));
        printStringMultipleTimes("GGWP", 3);

        int[] array1 = createIntArray(10, 5);
        printArray(array1);

        int[] array2 = new int[100];
        fillArrayWithIncrementingValues(array2);
        printArray(array2);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array3);
        printArray(array3);

        int[][] squareArray = createSquareArray(5);
        printSquareArray(squareArray);
    }
// Задание 1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
// Задание 2
    public static void checkSumSign() {
        int a = 1;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
// Задание 3
    public static void printColor() {
        int value = -1;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
// Задание 4
    public static void compareNumbers() {
        int a = 8;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
// Задание 5
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
// Задание 6
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
// Задание 7
    public static boolean isNegative(int number) {
        return number < 0;
    }
// Задание 8
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
// Задание 9
    public static int[] createIntArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
// Задание 10
    public static void fillArrayWithIncrementingValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
// Задание 11
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
// Задание 12
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
// Задание 13
    public static int[][] createSquareArray(int size) {
        int[][] squareArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            squareArray[i][i] = 1;
        }
        return squareArray;
    }
// Задание 14
    public static void printSquareArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
