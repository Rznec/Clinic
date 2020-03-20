public class Patient {

    public String lastName;
    public String firstName;
    public String secondName;
    public String pol;
    public int age;

    public Patient(String lastName, String firstName, String secondName, String pol, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.pol = pol;
        this.age = age;
    }

    @Override
    public String toString() {
        return lastName +
                "  " + firstName +
                "  " + secondName +
                "  " + pol +
                "  " + age;
    }
}
