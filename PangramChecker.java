import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
    
    public static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        
        // Iterate through the characters in the input string
        for (char ch : input.toCharArray()) {
            // Convert the character to lowercase for uniform comparison
            char lowerCaseChar = Character.toLowerCase(ch);
            
            // Check if the character is an alphabet letter and add it to the set
            if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
                alphabetSet.add(lowerCaseChar);
            }
        }
        
        // Check if the set contains all 26 alphabet letters
        return alphabetSet.size() == 26;
    }
}

