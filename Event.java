import java.util.ArrayList;

class Event {
    String name;
    String date;
    ArrayList<Person> attendees;

    Event(String name, String date) {
        this.name = name;
        this.date = date;
        this.attendees = new ArrayList<>();
    }

    void addAttendee(Person person) {
        this.attendees.add(person);
    }
}
