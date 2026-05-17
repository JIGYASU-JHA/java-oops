import java.util.*; 

public class Rectangle {

    float length, breadth, area, perimeter;

    public void read(Rectangle rec) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        rec.length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        rec.breadth = sc.nextFloat();
        sc.close();
    }

     public void calculate(Rectangle rec) {
        rec.area = rec.length * rec.breadth; 
        rec.perimeter = 2 * (rec.length + rec.breadth);    
       }

     public void display(Rectangle rec) {
        System.out.println("Area of the rectangle: " + rec.area);
        System.out.println("Perimeter of the rectangle: " + rec.perimeter);
    }

     public static void main(String args[]) {
        Rectangle rec = new Rectangle(); 
        rec.read();      
        rec.calculate(); 
        rec.display();  
    }
}
