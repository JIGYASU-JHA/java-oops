import java.util.*;

public class ArmstrongCounter {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 3; i++) numbers[i] = Integer.parseInt(args[i]);
        for (int i = 3; i < 5; i++) numbers[i] = sc.nextInt();
        sc.close();
        int count = 0;
        for (int num : numbers) if (isArmstrong(num)) count++;
        System.out.println("Total Armstrong numbers: " + count);
    }
}
