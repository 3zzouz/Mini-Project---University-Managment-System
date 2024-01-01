import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    String teacherId, specialty;
    List<Course> courses;
    private static int teacherIdCounter = 0;

    Teacher(String name, int age, String address, int phoneNumber) {
        super(name, age, address, phoneNumber);
        this.teacherId = teacherIdCounter + "";
        this.courses = new ArrayList<>();
        teacherIdCounter = teacherIdCounter + 1;
    }

    void assign(Course course) {
        this.courses.add(course);
        course.setTeacher(this);
    }

    void unassign(Course course) {
        this.courses.remove(course);
        course.setTeacher(null);
    }

    void changeSpecialty(String newSpecialty) {
        this.specialty = newSpecialty;
    }

    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", courses=" + courses +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
