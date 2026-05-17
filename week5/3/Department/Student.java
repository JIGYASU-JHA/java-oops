package Department;

public class Student {
    String name,semester,branch;
    int rollNo;
    double cgpa;

    public Student() {
        name = "JIGYASU";
        semester = "4th";
        branch = "CSE";
        rollNo = 3509;
        cgpa = 9.9;
    }

    public void show() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Branch: " + branch);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("CGPA: " + cgpa);
    }
}
