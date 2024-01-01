public class Person {
    String name, address;
    int age, phoneNumber, id;
    private static int idCounter = 0;

    Person(String name, int age, String address, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = idCounter++;
    }

    void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    void changePhoneNumber(int newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
