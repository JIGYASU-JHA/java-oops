import java.util.Scanner;

public class ArrayOutOfBounds {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the numbers:");
        try {
            for (int i = 0; i <= size; i++) {
                array[i] = sc.nextInt();
            }
        } 
       catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Exception in thread \"main\" " +e);
        }

        sc.close();
    }
}
