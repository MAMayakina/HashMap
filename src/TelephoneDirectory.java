import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelephoneDirectory {

    public TelephoneDirectory() {
    }

    private static Map<String, String> telephoneDirectory = new HashMap<>();

    public static void addNewContact(String name, String number) {
        if (telephoneDirectory.containsKey(name)) {
            if (telephoneDirectory.containsValue(number)) {
                System.out.println("Контакт " + name + " (" + number + ") уже есть в справочнике!");
            } else {
                System.out.println(name + " уже есть в справочнике с номером " + telephoneDirectory.get(name) + ". Заменяем номер на " + number);
                telephoneDirectory.put(name, number);
            }
        } else {
            System.out.println(name + " (номер " + number + ") добавлен в справочник");
            telephoneDirectory.put(name, number);
        }
    }

    public static void printTelephoneDirectory() {
        System.out.println("Телефонный справочник:");
        for (Map.Entry<String, String> directory : telephoneDirectory.entrySet()) {
            System.out.println(directory.getKey() + " - " + directory.getValue());
        }
    }

    public static Map<String, String> getTelephoneDirectory() {
        return telephoneDirectory;
    }
}
