package P2;
public class Contract_empsalary {
    Employee employee;
    double hourlyRate;
    int hoursWorked;
 public Contract_empsalary() {
        employee = new Employee();
        hourlyRate = 250;
        hoursWorked = 160;
    }

    public void displaySalary() {
        employee.display();
        double totalSalary = hourlyRate * hoursWorked;
        System.out.println("Contract Employee Total Salary: Rs" + totalSalary);
    }
}
