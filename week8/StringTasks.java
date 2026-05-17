import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // i
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        System.out.println("The string after changing the case is: " + changeCase(s1));

        // ii
        System.out.println("The string after reversing is: " + reverseString(s1));

        // iii
        System.out.print("Enter second string for comparison: ");
        String s2 = sc.nextLine();
        System.out.println("The difference between ASCII values is: " + compareStrings(s1, s2));

        // iv
        System.out.print("Enter string to insert: ");
        String s3 = sc.nextLine();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        sc.nextLine(); 
        System.out.println("The string after insertion is: " + manualInsert(s1, s3, pos));

        // v
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // vi
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        checkChar(s1, c);

        // vii
        System.out.println(isPalindrome(s1) ? "Entered string is palindrome" : "Entered string is not a palindrome");

        // viii
        countDetails(s1);

        sc.close();
    }

    public static String changeCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return sb.toString();
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int compareStrings(String s1, String s2) {
        int diff = 0;
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            diff += Math.abs(s1.charAt(i) - s2.charAt(i));
        }
        return diff;
    }

    public static String manualInsert(String s1, String s2, int pos) {
        if (pos < 0 || pos > s1.length()) return "Invalid Position";
        return s1.substring(0, pos) + s2 + s1.substring(pos);
    }

    public static void checkChar(String s, char c) {
        int pos = s.indexOf(c);
        System.out.println(pos != -1 ? "Position of entered character: " + (pos + 1) : "Entered character is not present");
    }

    public static boolean isPalindrome(String s) {
        String cleanStr = s.toLowerCase();
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }

    public static void countDetails(String s) {
        int vowels = 0, consonants = 0, words = s.split("\\s+").length;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("No. of words: " + words + " No. of vowels: " + vowels + " No. of consonants: " + consonants);
    }
}
