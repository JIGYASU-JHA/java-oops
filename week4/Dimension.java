import java.util.Scanner;

class Plate {
    float length;
    float width;

    public Plate(float length, float width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called.");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    float height;

    public Box(float length, float width, float height) {
        super(length, width); 
        this.height = height;
        System.out.println("Box constructor called.");
        System.out.println("Height: " + height);
    }
}

class WoodBox extends Box {
    float thickness;

    public WoodBox(float length, float width, float height, float thickness) {
        super(length, width, height); 
        this.thickness = thickness;
        System.out.println("WoodBox constructor called.");
        System.out.println("Thickness: " + thickness);
    }
}

public class Dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        float length = sc.nextFloat();
        System.out.println("Enter the width: ");
        float width = sc.nextFloat();
        System.out.println("Enter the height: ");
        float height = sc.nextFloat();
        System.out.println("Enter the thickness: ");
        float thickness = sc.nextFloat();
        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        sc.close();
    }
}
