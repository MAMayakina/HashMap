import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RandomValues {
    private static Map<String, List<Integer>> randomValuesCollection = new HashMap<>();
    private static Map<String, Integer> transformationCollection = new HashMap<>();

    public RandomValues() {
    }

    private static List<Integer> randomValues() {
        List<Integer> randomValues = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            randomValues.add((int) (Math.random() * 1000));
        }
        return randomValues;
    }

    public static void addNewElement(String str) {
        randomValuesCollection.put(str, randomValues());
        System.out.println("Добален новый элемент: " + str + " --> " + randomValuesCollection.get(str));
    }

    public static void printCollection() {
        System.out.println("Коллекция рандомных чисел");
        for (Map.Entry<String, List<Integer>> entry : randomValuesCollection.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    public static void transformationCollection() {
        System.out.println("Трансформируем коллекцию");
        for (Map.Entry<String, List<Integer>> entry : randomValuesCollection.entrySet()) {
            Integer newValue = 0;
            for (Integer num : entry.getValue()) {
                newValue = newValue + num;
            }
            transformationCollection.put(entry.getKey(), newValue);
            System.out.print("Исходная коллекция " + entry.getKey()+ " --> " + entry.getValue() + "     ");
            System.out.println("Новая коллекция " + entry.getKey()+ " --> " + transformationCollection.get(entry.getKey()));
        }

    }
}




