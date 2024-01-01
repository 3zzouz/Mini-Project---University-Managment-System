import java.util.ArrayList;

class Course {
    String name;
    Teacher teacher;
    ArrayList<Student> students;
    int nbOfHours;

    Course(String name, int nbOfHours) {
        this.name = name;
        this.students = new ArrayList<>();
        this.nbOfHours = nbOfHours;
    }

    void addStudent(Student student) {
        this.students.add(student);
    }

    void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void removeStudent(Student student) {
        this.students.remove(student);
    }

    void changeNbOfHours(int newNbOfHours) {
        this.nbOfHours = newNbOfHours;
    }

    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", creditHours=" + nbOfHours +
                '}';
    }
}
