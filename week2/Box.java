import java.util.*;  

public class Box 
{
    float length, width, height;

    public float Volume() 
    {
        return length * width * height;
    }

    public static void main(String args[]) 
     {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();
        System.out.print("Enter the length of the box: ");
        box.length = sc.nextFloat();
        System.out.print("Enter the width of the box: ");
        box.width = sc.nextFloat();
        System.out.print("Enter the height of the box: ");
        box.height = sc.nextFloat();
        System.out.println("The volume of the box is: " + box.Volume());
   
    }
}
