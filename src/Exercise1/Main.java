package Exercise1;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "apple", "orange", "banana", "grape",
                "apple", "pear", "grape", "peach", "pear", "banana",
                "apple", "peach", "plum", "peach", "plum", "peach"
        };

        WordProcessor.processWords(words);
    }
}