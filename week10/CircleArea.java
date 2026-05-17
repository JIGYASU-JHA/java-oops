import java.io.*;

public class CircleArea {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the radius of the circle: ");
            double radius = Double.parseDouble(br.readLine());
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is: " + area);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
