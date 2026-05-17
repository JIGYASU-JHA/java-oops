package P1;
public class Regular_empsalary {
    Employee employee;
    double salary;
public Regular_empsalary() {
        employee = new Employee();
        salary = 200000;
    }
 public void displaySalary() {
        employee.display();
        System.out.println("Regular Employee Salary: Rs" + salary);
    }
}
