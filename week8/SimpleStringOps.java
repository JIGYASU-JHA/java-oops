import java.util.Scanner;

public class SimpleStringOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Changed case: " + s.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append));

        System.out.println("Reversed: " + new StringBuilder(s).reverse());

        System.out.print("Enter another string: ");
        String s2 = sc.nextLine();
        System.out.println("Comparison: " + s.compareTo(s2));

        System.out.print("Enter string to insert: ");
        String s3 = sc.nextLine();
        System.out.println("After insert: " + s + " " + s3);

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int p = s.indexOf(c);
        System.out.println(p != -1 ? "Position: " + p : "Character not found");

        System.out.println(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not palindrome");

        String[] w = s.split(" ");
        int v = 0, co = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
                else co++;
            }
        }
        System.out.println("Words: " + w.length + ", Vowels: " + v + ", Consonants: " + co);

        sc.close();
    }
}