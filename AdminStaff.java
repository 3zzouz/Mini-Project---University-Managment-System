class AdminStaff extends Person {
    String staffId;
    private static int staffIdCounter = 0;

    AdminStaff(String name, int age, String staffId, String address, int phoneNumber) {
        super(name, age, address, phoneNumber);
        this.staffId = staffIdCounter + "";
        staffIdCounter = staffIdCounter + 1;
    }

    void assignTeacherToCourse(Teacher teacher, Course course) {
        teacher.assign(course);
    }
}
