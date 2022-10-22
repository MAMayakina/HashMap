import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MarksOfStudents {

    public MarksOfStudents() {
    }

    private static Map<String, Integer> marksOfStudents = new HashMap<>();

    public static void addNewStudent(String nameOfStudent, Integer mark) {
        if (marksOfStudents.containsKey(nameOfStudent)) {
            if (marksOfStudents.get(nameOfStudent).equals(mark)) {
                throw new RuntimeException("Студент с такой оценкой уже есть в ведомости!");
            } else {
                marksOfStudents.put(nameOfStudent, mark);
                System.out.println(nameOfStudent +" (оценка "+marksOfStudents.get(nameOfStudent) + ") уже есть в ведомости. Заменяем оценку на " + mark);
            }
        } else {
            marksOfStudents.put(nameOfStudent, mark);
            System.out.println(nameOfStudent + " (оценка " + mark + ") добавлен в ведомость");
        }
    }

    public static void printMarksOfStudents() {
        System.out.println("Оценки студентов:");
        for (Map.Entry<String, Integer> markOfStident : marksOfStudents.entrySet()) {
            System.out.println(markOfStident.getKey() + " - " + markOfStident.getValue());
        }
    }

    public static Map<String, Integer> getMarksOfStudents() {
        return marksOfStudents;
    }
}

