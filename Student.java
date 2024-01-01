import java.util.ArrayList;

public class Student extends Person {
    String studentId;
    ArrayList<Course> courses;
    double score;
    private static int studentIdCounter = 0;

    Student(String name, int age, double score, String address, int phoneNumber) {
        super(name, age, address, phoneNumber);
        this.studentId = studentId + "";
        this.courses = new ArrayList<>();
        this.score = score;
        studentIdCounter = studentIdCounter + 1;
    }

    void enroll(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    void drop(Course course) {
        this.courses.remove(course);
        course.removeStudent(this);
    }

    void changeScore(double newScore) {
        this.score = newScore;
    }

    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", courses=" + courses +
                ", gpa=" + score +
                '}';
    }

    
}
