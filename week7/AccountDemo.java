import java.util.*;

class Account {
    String bankName, accountName, password;
    int accountID;
    double balance;

    void get_account_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();
        System.out.print("Enter Account ID: ");
        accountID = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Account Name: ");
        accountName = sc.nextLine();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Enter Password: ");
        password = sc.nextLine();
    }
    void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}

public class AccountDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        account.get_account_details();
        account.display();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        sc.close();
    }
}
