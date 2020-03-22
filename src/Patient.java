import java.util.Comparator;

public class Patient{

    private int id;
    private final String lastName;
    private final String firstName;
    private final String secondName;
    private String gender;
    private int age;

    public Patient(int id, String lastName, String firstName, String secondName, String gender, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return lastName +
                "  " + firstName +
                "  " + secondName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class ComparatorPatientAge implements Comparator<Patient> {
    @Override
    public int compare(Patient o, Patient t1) {
        return Integer.compare(t1.getAge(), o.getAge());
    }
}
class ComparatorPatientId implements Comparator<Patient>{

    @Override
    public int compare(Patient patient, Patient t1) {
        return Integer.compare(patient.getId(), t1.getId());
    }
}

