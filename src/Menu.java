import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Меню
 */
public class Menu {

    private static final String WELCOME = "\n\nДобро пожаловать!";
    private static final String ENTER_COMMAND = "\nВыберите интересующий вас раздел: \n 1) Регистация \n 2) Запись на прием \n 3) Выход из программы";
    private Scanner scannerIn = new Scanner(System.in);
    private int command;

    LinkedHashMap<Integer, Patient> patients = new LinkedHashMap<>();

    /**
     * Приветствие пользователя
     */
    private void sayHello() {
        System.out.println(WELCOME);
    }

    /**
     * Регистрация пациентов
     */

    private LinkedHashMap<Integer, Patient> createPatients() {
        Patient patient1 = new Patient(1, "Гамазков", "Роман", "Сергеевич", "мужской", 23);
        Patient patient2 = new Patient(2, "Иванов", "Иван", "Иванович", "мужской", 67);
        Patient patient3 = new Patient(3, "Плотников", "Дмитрий", "Олегович", "мужской", 28);
        Patient patient4 = new Patient(4, "Костикова", "Ирина", "Сергеевна", "женский", 666);
        Patient patient5 = new Patient(5, "Пронин", "Андрей", "Дмитриевич", "мужской", 23);
        Patient patient6 = new Patient(6, "Кумарина", "Арина", "Валериевна", "женский", 47);
        Patient patient7 = new Patient(7, "Джавов", "Джав", "Джавович", "мужской", 43);
        Patient patient8 = new Patient(8, "Вупоров", "Вупор", "Вупорович", "мужской", 31);
        Patient patient9 = new Patient(9, "Братов", "Брат", "Братович", "мужской", 20);
        Patient patient10 = new Patient(10, "Пипкова", "Пипка", "Пипковна", "женский", 74);

        patients.put(patient1.getId(), patient1);
        patients.put(patient2.getId(), patient2);
        patients.put(patient3.getId(), patient3);
        patients.put(patient4.getId(), patient4);
        patients.put(patient5.getId(), patient5);
        patients.put(patient6.getId(), patient6);
        patients.put(patient7.getId(), patient7);
        patients.put(patient8.getId(), patient8);
        patients.put(patient9.getId(), patient9);
        patients.put(patient10.getId(), patient10);

        return patients;
    }

    /**
     * Главное меню
     */

    public void menu() {
        sayHello();
        System.out.println(ENTER_COMMAND);
        command = -200;
        while (command != 3) {
            int command = scannerIn.nextInt();
            switch (command) {
                case 1:
                    patients = createPatients();
                    System.out.println("Вы зарегистрированы");
                    System.out.println("Список пациентов: ");
                    Set set = patients.entrySet();
                    for (Object element : set) {
                        Map.Entry mapEntry = (Map.Entry) element;
                        System.out.println("ID: " + mapEntry.getKey() + ", Пациент: " + mapEntry.getValue());
                    }
                    break;
                case 2:
                    patients = createPatients();
                    Turn.sortMap(patients);
                    Set set1 = patients.entrySet();
                    for (Object element : set1) {
                        Map.Entry mapEntry = (Map.Entry) element;
                        System.out.println("ID: " + mapEntry.getKey() + ", Пациент: " + mapEntry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("До свидания! Не болейте!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильная команда! Попробуйте снова :)");
            }
        }
    }
}