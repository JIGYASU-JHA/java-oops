abstract class Student {
    String name;
    int rollNo;
 public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
  public abstract void marks();
  public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class CIA extends Student {
    int ciaMarks;
  public CIA(String name, int rollNo, int ciaMarks) {
        super(name, rollNo); 
        this.ciaMarks = ciaMarks;
    }
  public void marks() {
        System.out.println("CIA Marks for " + name + ": " + ciaMarks);
    }
}

class Semester extends Student {
    int semesterMarks;
 public Semester(String name, int rollNo, int semesterMarks) {
        super(name, rollNo);  
        this.semesterMarks = semesterMarks;
    }
  public void marks() {
        System.out.println("Semester Marks for " + name + ": " + semesterMarks);
    }
}

public class Details {
    public static void main(String args[]) {
        Student ciaStudent = new CIA("JIGYASU", 101, 85);
        Student semesterStudent = new Semester("KUMAR", 102, 90);
        System.out.println("CIA Student Details:");
        ciaStudent.displayDetails();
        ciaStudent.marks();
        System.out.println("Semester Student Details:");
        semesterStudent.displayDetails();
        semesterStudent.marks();
    }
}

