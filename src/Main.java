import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // 1
        printThreeWords();
        // 2
        checkSumSign();
        // 3
        printColor();
        // 4
        compareNumbers();
        // 5
        System.out.println(checkSumInRange(5, 6));
        // 6
        printPositiveOrNegative(7);
        // 7
        System.out.println(isNegative(-3));
        // 8
        printStringMultipleTimes("GGWP", 3);
        // 9
        System.out.println(isLeapYear(2024));
        // 10
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swapArrayElements(array1);
        System.out.println(Arrays.toString(array1));
        // 11
        int[] array2 = new int[100];
        fillArray(array2);
        System.out.println(Arrays.toString(array2));
        // 12
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThan6(array3);
        System.out.println(Arrays.toString(array3));
        // 13
        int size = 5;
        int[][] matrix = new int[size][size];
        fillDiagonal(matrix);
        printMatrix(matrix);
        // 14
        int[] newArray = createArray(3, 6);
        System.out.println(Arrays.toString(newArray)); // 14
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
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
// Задание 10
    public static void swapArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

// Задание 11
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

// Задание 12
    public static void multiplyLessThan6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

// Задание 13
    public static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
// Задание 14
    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        Arrays.fill(newArray, initialValue);
        return newArray;
    }
}