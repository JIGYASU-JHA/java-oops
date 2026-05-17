import java.util.*;

public class Book {
    String title;
    String author;
    float price;

    Book() {
        this("The Forest of Enchantments", "Chitra Banerjee Divakaruni", 36900f);
    }

    Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(String title, String author) {
        this(title, author, 0.0f); 
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of Book: ");
        String title = sc.nextLine();
        System.out.print("Enter author of Book: ");
        String author = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        float price = sc.nextFloat();

        sc.close();

        System.out.println("Details of Book with 1st Parameterized constructor:");
        Book book1 = new Book(title, author);

        System.out.println("Details of Book with 2nd Parameterized constructor:");
        Book book2 = new Book(title, author, price);

        System.out.println("Details of Book with default constructor:");
        Book book3 = new Book();
    }
}
