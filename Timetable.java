import java.util.ArrayList;

class Timetable {
    Student student;
    ArrayList<Course> courses;

    Timetable(Student student) {
        this.student = student;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course course) {
        this.courses.add(course);
    }
}
