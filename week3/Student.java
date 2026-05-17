
public class Student {
     int studentID;
     String name;
     char grade;

    public Student() {
        this.studentID = 0;
        this.name = "unknown";
        this.grade = 'A';
    }

    public Student(int studentID, String name, char grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String args[]) {
        Student defaultStudent = new Student();
        System.out.println("Default Constructor:");
        defaultStudent.printDetails();
        System.out.println();
        Student parameterizedStudent = new Student(101, "JIGYASU", 'E');
        System.out.println("Parameterized Constructor:");
        parameterizedStudent.printDetails();
    }
}
