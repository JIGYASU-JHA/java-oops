package P3;

import P1.*;
import P2.*;

public class Empdetails {
    public static void main(String args[]) {
        Regular_empsalary ob1 = new Regular_empsalary();
        ob1.displaySalary(); 

        System.out.println("\n");

        Contract_empsalary ob2 = new Contract_empsalary();
        ob2.displaySalary();
    }
}
