import java.util.ArrayList;

class Exam {
    Course course;
    String date;
    ArrayList<Student> attendees;

    Exam(Course course, String date) {
        this.course = course;
        this.date = date;
        this.attendees = new ArrayList<>();
    }

    void addAttendee(Student student) {
        this.attendees.add(student);
    }

    public String toString() {
        return "Exam{" +
                "course=" + course +
                ", date='" + date + '\'' +
                ", attendees=" + attendees +
                '}';
    }

}
