import java.util.ArrayList;

class Group {
    String name;
    ArrayList<Student> members;

    Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    void addMember(Student student) {
        this.members.add(student);
    }
}
