import java.util.ArrayList;

class Club {
    String name;
    ArrayList<Student> members;

    Club(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    void addMember(Student student) {
        this.members.add(student);
    }
}
