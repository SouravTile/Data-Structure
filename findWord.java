import java.util.HashMap;
import java.util.Map;

public class findWord {
    public static void main(String []args)
    {
        String str = "GeeksforGeeks A computer science portal for geeks";
        String find = "portal";

        // Split the string by spaces
        String[] words = str.split(" ");

        // Create a map to store word occurrences
        Map<String, Integer> Count = new HashMap<>();

        for (String word : words) {
            Count.put(word, Count.getOrDefault(word, 0) + 1);
        }

        // Print the word occurrences
        System.out.println("Occurrences of Word = " + Count.getOrDefault(find,0));
    }
}
