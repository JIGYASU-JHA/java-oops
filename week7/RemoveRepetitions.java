import java.util.*;

public class RemoveRepetitions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Array after removing repetitions: ");
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.print(numbers[i] + " ");
            }
        }
        sc.close();
    }
}
