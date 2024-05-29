import java.util.HashMap;
public class EachWordCountInString {

    public static void main(String[] args) 
    {
        String s = "hello world";
        HashMap<Character, Integer> count = new HashMap<>();
        // Loop through each character in the input string
        for (char ch : s.toCharArray()) 
        {
            if (count.containsKey(ch)) 
            {
                // Increment the count if the character is already in the map
                count.put(ch, count.get(ch) + 1); //if count.get(ch) is 1 it will add + 1 
            } else 
            {
                // Add the character to the map with a count of 1 if it's not already present
                count.put(ch, 1);
            }
        }
        // Print the appearance count of each character
        for (char ch : count.keySet()) 
        {
            System.out.println( ch + " = " + count.get(ch));
        }
    }
}
    /*
    public static void main(String[] args) {
        String input = "hello world";

        // Convert the input string to lowercase (optional)
        input = input.toLowerCase();

        // Loop through each character (ASCII range 'a' to 'z')
        for (int i=0;i<input.length();i++) 
        {
            char c=input.charAt(i);
            int count = 0;
            // Loop through the input string to count appearances of the current character
            for (int j = 0; j < input.length(); j++) 
            {
                if (input.charAt(j) == c) 
                    count++;
                
            }
            // Print only if the character appears at least once
            if (count > 0) 
                System.out.println("Character '" + c + "' appears " + count + " times.");
            
        }
    }
}
*/
