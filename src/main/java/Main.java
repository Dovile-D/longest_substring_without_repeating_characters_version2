// Java program to find the length of the longest substring without repeating characters
import java.util.*;

public class Main {

    // Driver code
    public static void main(String[] args) {
        System.out.println("The program to define the longest part of given string without repeating characters");
        Scanner scan = new Scanner(System.in);
        System.out.println("_______________________________________");
        System.out.println("Please enter a string:\n");
        String givenString = scan.nextLine();
        System.out.println("The input string is " + givenString);

        int maxLength = longestUniqueSubstring(givenString);
        System.out.println("The length of the longest non-repeating character substring is " + maxLength);
    }

    /**
     * The function to define the length of the longest substring without repeating characters
     * @param givenString the string passed to function as parameter
     * @return the length of the longest substring without repeating characters
     */
    public static int longestUniqueSubstring(String givenString) {
        int length = givenString.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            // There are 2^8 = 256 chars in an extended ASCII char set.
            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for (int j = i; j < length; j++) {
                // If current character is visited break the loop

                if (visited[givenString.charAt(j)] == true) {
                    break;
                }
                    // Else update the result if this window is larger, and mark current character as visited.
                else {
                    result = Math.max(result, j - i + 1);
                    visited[givenString.charAt(j)] = true;
                }
            }

        }
        return result;
    }
}
