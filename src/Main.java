public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "A"}
        };

        try {
            System.out.println("Sum of array1: " + ArrayProcessor.sumArray(array1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of array2: " + ArrayProcessor.sumArray(array2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}