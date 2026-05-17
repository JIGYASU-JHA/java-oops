import java.util.*;

public class Arithmetic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } 
        finally {
                        System.out.println("Execution completed.");
        }
        sc.close(); 
    }
}
