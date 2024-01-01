public class Main {
    public static void main(String[] args) {
        // Create objects
        Teacher teacher1 = new Teacher("John", 30, "123 Street", 12345678);
        Teacher teacher2 = new Teacher("Jane", 35, "456 Street", 98765432);
        Student student1 = new Student("Alice", 20, 15, "789 Street", 1593577);
        Student student2 = new Student("Bob", 25, 12, "321 Street", 7539514);
        Course course1 = new Course("Math", 3);
        Course course2 = new Course("Science", 4);
        AdminStaff admin = new AdminStaff("Jack", 40, "1234", "987 Street", 1234567);
        Classroom classroom1 = new Classroom("101");
        Classroom classroom2 = new Classroom("102");
        Club club = new Club("Science Club");
        Event event = new Event("Science Fair", "2024-12-01");
        Group group = new Group("Study Group");
        Timetable timetable1 = new Timetable(student1);
        Timetable timetable2 = new Timetable(student2);
        Exam mathExam = new Exam(course1, "2024-12-15");

        // Print out the exam details
        System.out.println("Exam course: " + mathExam.course.name);
        System.out.println("Exam date: " + mathExam.date);
        System.out.println(mathExam.toString());

        // Test functionalities
        // Students enroll in courses
        student1.enroll(course1);
        student2.enroll(course2);

        // Teachers are assigned to courses
        teacher1.assign(course1);
        teacher2.assign(course2);

        // Classrooms add courses
        classroom1.addCourse(course1);
        classroom2.addCourse(course2);

        // Club adds members
        club.addMember(student1);
        club.addMember(student2);

        // Event adds attendees
        event.addAttendee(student1);
        event.addAttendee(teacher1);
        event.addAttendee(admin);

        // Group adds members
        group.addMember(student1);
        group.addMember(student2);

        // Timetables add courses
        timetable1.addCourse(course1);
        timetable2.addCourse(course2);

        // Change some attributes
        student1.changeScore(3.6);
        teacher1.changeSpecialty("Physics");
        course1.changeNbOfHours(14);

        // Print out some information
        System.out.println("Course1 students: " + course1.students.size());
        System.out.println("Course2 students: " + course2.students.size());
        System.out.println("Club members: " + club.members.size());
        System.out.println("Event attendees: " + event.attendees.size());
        System.out.println("Group members: " + group.members.size());

        // Create an Event object
        Event schoolEvent = new Event("School Fair", "2022-12-01");

        // Add attendees to the event
        schoolEvent.addAttendee(teacher1);
        schoolEvent.addAttendee(student1);

        // Print out the numbser of attendees
        System.out.println("School Event : " + schoolEvent.attendees.size());
    }
}