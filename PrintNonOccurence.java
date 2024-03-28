import java.util.HashMap;
import java.util.Map;

public class PrintNonOccurence 
{
    public static void main(String[] args) 
    {
        String input = "nnjkljklhihis";
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (charCount.get(input.charAt(i)) == 1) {
                System.out.println("First Non-Repeating Character: " + input.charAt(i));
                break;
            } else if (i == input.length() - 1) {
                System.out.println("No non-repeating character found.");
            }
        }
    
    }    
}
