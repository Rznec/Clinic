import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Turn {
    public static LinkedHashMap<Integer, Patient> sortMap(LinkedHashMap<Integer, Patient> map) {
        Comparator<Patient> patientComparatorAge = new ComparatorPatientAge();
        TreeSet<Patient> patients = new TreeSet<>(patientComparatorAge);
        for (int i = 1; i < map.size() + 1; i++) {
            patients.add(map.get(i));
        }
        Comparator<Patient> patientComparatorId = new ComparatorPatientId();
        TreeSet<Patient> pensionerID = new TreeSet<>(patientComparatorId);
        TreeSet<Patient> noPensionerID = new TreeSet<>(patientComparatorId);
        for (Patient patient : patients) {
            if (patient.getAge() >= 65) {
                pensionerID.add(patient);
            } else {
                noPensionerID.add(patient);
            }
        }
        map.clear();
        for (Patient patient : pensionerID) {
            map.put(patient.getId(), patient);
        }
        for (Patient patient : noPensionerID) {
            map.put(patient.getId(), patient);
        }
        return map;
    }
}
