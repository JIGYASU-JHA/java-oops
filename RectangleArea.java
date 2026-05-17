import java.util.*;

public class RectangleArea {
    public static class Rectangle {
        float length;
        float breadth;

        public Rectangle(float length, float breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public float area() {
            return this.length * this.breadth;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth of a rectangle: ");
        float breadth = sc.nextFloat();
        sc.close();

        Rectangle rectangle_obj = new Rectangle(length, breadth);
        float area = rectangle_obj.area();
        System.out.println("Area of rectangle: " + area);
    }
}
