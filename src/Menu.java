import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Меню
 */
public class Menu {

    private static final String WELCOME = "\n\nДобро пожаловать!";
    private static final String ENTER_COMMAND = "\nВыберите интересующий вас раздел: \n 1) Регистация \n 2) Запись на прием \n 3) Выход из программы";
    private Scanner scannerIn = new Scanner(System.in);

    LinkedHashMap<Integer, Patient> patients = new LinkedHashMap<>();


    Patient patient1 = new Patient("Гамазков", "Роман", "Сергеевич", "мужской", 23);
    Patient patient2 = new Patient("Иванов", "Иван", "Иванович", "мужской", 67);
    Patient patient3 = new Patient("Плотников", "Дмитрий", "Олегович", "мужской", 28);
    Patient patient4 = new Patient("Костикова", "Ирина", "Сергеевна", "женский", 666);
    Patient patient5 = new Patient("Пронин", "Андрей", "Дмитриевич", "мужской", 23);
    Patient patient6 = new Patient("Кумарина", "Арина", "Валериевна", "женский", 47);
    Patient patient7 = new Patient("Джавов", "Джав", "Джавович", "мужской", 43);
    Patient patient8 = new Patient("Вупоров", "Вупор", "Вупорович", "мужской", 31);
    Patient patient9 = new Patient("Братов", "Брат", "Братович", "мужской", 20);
    Patient patient10 = new Patient("Пипкова", "Пипка", "Пипковна", "женский", 74);

    /**
     * Приветствие пользователя
     */
    private void sayHello() {
        System.out.println(WELCOME);
    }

    /**
     * Главное меню
     */
    public void menu() {
        sayHello();
        System.out.println(ENTER_COMMAND);
        int command = scannerIn.nextInt();
        switch (command) {
            case 1:
                patients.put(1, patient1);
                patients.put(2, patient2);
                patients.put(3, patient3);
                patients.put(4, patient4);
                patients.put(5, patient5);
                patients.put(6, patient6);
                patients.put(7, patient7);
                patients.put(8, patient8);
                patients.put(9, patient9);
                patients.put(10, patient10);
                System.out.println("Вы зарегистрированы");
                System.out.println("Список пациентов: ");

                Set set = patients.entrySet();

                for (Object element : set) {
                    Map.Entry mapEntry = (Map.Entry) element;
                    System.out.println("ID: " + mapEntry.getKey() + ", Пациент: " + mapEntry.getValue());
                }
                break;
            case 2:

                break;
            case 3:
                System.out.println("До свидания! Не болейте!");
                System.exit(0);
            default:
                System.out.println("Неправильная команда! Попробуйте снова :)");
        }
    }
}