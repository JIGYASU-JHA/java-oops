import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String caseChanged = changeCase(str);
        System.out.println("The string after changing the case is: " + caseChanged);
        
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("The string after reversing is: " + reversed);
        
        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();
        int difference = compareStrings(str, str2);
        System.out.println("The difference between ASCII values is: " + difference);

        System.out.print("Enter the string to be inserted into the first string: ");
        String insertStr = sc.nextLine();
        String insertedString = str + " " + insertStr;
        System.out.println("The string after insertion is: " + insertedString);

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
 
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int position = str.indexOf(ch);
        if (position != -1) {
            System.out.println("Position of entered character: " + position);
        } else {
            System.out.println("Entered character is not present");
        }
        
        if (isPalindrome(str)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

        countWordsVowelsConsonants(str);
        
        sc.close();
    }
    
    public static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }
    
    public static int compareStrings(String s1, String s2) {
        return s1.compareTo(s2);
    }
    
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    public static void countWordsVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        String[] words = str.split("\\s+");
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
