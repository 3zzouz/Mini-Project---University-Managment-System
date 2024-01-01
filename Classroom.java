import java.util.ArrayList;

class Classroom {
    String roomNumber;
    ArrayList<Course> courses;

    Classroom(String roomNumber) {
        this.roomNumber = roomNumber;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course course) {
        this.courses.add(course);
    }
}