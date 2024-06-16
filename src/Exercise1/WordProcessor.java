package Exercise1;
import java.util.*;

public class WordProcessor {
    public static void processWords(String[] words) {
        // Используем HashSet для хранения уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words: " + uniqueWords);

        // Используем HashMap для подсчета количества вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word counts: " + wordCount);
    }
}