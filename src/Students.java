import java.util.HashMap;
import java.util.Map;

public class Students {

    public Students() {
    }

    private static Map<Integer, String> students = new HashMap<>();

    public static void addNewStudent(Integer idStudent, String nameOfStudent) {
        if (students.containsKey(idStudent)) {
            if (students.get(idStudent).equals(nameOfStudent)) {
                System.out.println("Студент с таким id уже есть в списке!");
            } else {
                System.out.println("Под id " + idStudent + " числится студент " + students.get(idStudent) + ". Заменяем студента на " + nameOfStudent);
                students.put(idStudent, nameOfStudent);
            }
        } else {
            students.put(idStudent, nameOfStudent);
            System.out.println("Студент id " + idStudent + " " + nameOfStudent + " добавлен в список");
        }
    }

    public static void printAllStudents() {
        System.out.println("Список студентов:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("id " + student.getKey() + " - " + student.getValue());
        }
    }

}
