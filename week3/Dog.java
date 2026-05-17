import java.util.*;
public class Dog{
     String name;
     String colour;
   Dog(String name, String colour) {
      this.name=name;
      this.colour=colour;
   }
  void Display(){
         System.out.println("Name:" + this.name);
         System.out.println("Colour:" + this.colour);
  }
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Dog's Name: ");
  String name = sc.nextLine();
  System.out.println("Enter Dog's Colour: ");
  String colour = sc.nextLine();
  Dog dog = new Dog(name, colour);
  System.out.println("Dog's Details: ");
  dog.Display();
sc.close(); 
   }
}