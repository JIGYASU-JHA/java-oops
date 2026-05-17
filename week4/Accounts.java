import java.util.*;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.println("Enter account number: ");
        acc_no = sc.nextInt();  
        System.out.println("Enter balance: ");
        balance = sc.nextDouble(); 
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);  
        sc.nextLine(); 
        System.out.println("Enter name: ");
        name = sc.nextLine();  
        System.out.println("Enter Aadhar number:");
        aadhar_no = sc.nextLine();  
    }

    void disp() {
        super.disp();  
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Accounts {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];  

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            System.out.println("Enter details of person " + (i + 1));
            persons[i].input(sc);  
        }
        System.out.println("\nDetails of persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            persons[i].disp();  // Display details of each person
        }
        sc.close();
    }
}
