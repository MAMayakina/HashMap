public class Main {
    public static void main(String[] args) {
        //ДЗ 1 - задания 1 (Class TelephoneDirectory - Map<String, String>)
        System.out.println("*****ДЗ телефонный справочник");
        TelephoneDirectory.addNewContact("Петров Илья", "728315625");
        TelephoneDirectory.addNewContact("Иванов Геннадий", "+72924731323");
        TelephoneDirectory.addNewContact("Васильков Андрей", "+72582196567");
        TelephoneDirectory.addNewContact("Хохлов Владимир", "+79520342365");
        TelephoneDirectory.addNewContact("Марков Григорий", "89272902864");
        TelephoneDirectory.addNewContact("Чайковский Ярослав", "83502359841");
        TelephoneDirectory.addNewContact("Светлов Игорь", "+79600102224");
        TelephoneDirectory.addNewContact("Ананьева Дарья", "+72547320156");
        TelephoneDirectory.addNewContact("Брежнева Анастасия", "+79252331522");
        TelephoneDirectory.addNewContact("Тюльпанов Александр", "+73561146521");
        TelephoneDirectory.addNewContact("Митрофанов Дмитрий", "891635248");
        TelephoneDirectory.addNewContact("Бобров Владимир", "89256583588");
        TelephoneDirectory.addNewContact("Клюев Андрей", "89253113541");
        TelephoneDirectory.addNewContact("Азамова Наталья", "+79023373236");
        TelephoneDirectory.addNewContact("Алешин Максим", "+79315235564");
        TelephoneDirectory.addNewContact("Алексеева Татьяна", "+79171575263");
        TelephoneDirectory.addNewContact("Буланова Виолетта", "+79376778459");
        TelephoneDirectory.addNewContact("Левочкин Кирилл", "+79016588152");
        TelephoneDirectory.addNewContact("Сидорчук Евгений", "+79170670200");
        TelephoneDirectory.addNewContact("Сидоров Олег", "79315625035");

        System.out.println();
        TelephoneDirectory.addNewContact("Сидоров Олег", "79315625035");//Добавляем дублирующийся контакт
        TelephoneDirectory.addNewContact("Сидорчук Евгений", "89170670200");//Добавляем контакт с др.номером

        System.out.println();
        TelephoneDirectory.printTelephoneDirectory();

        //ДЗ 1 - задание 3 (Class MarksOfStudent - Map <String, Integer>)
        System.out.println();
        System.out.println("*****Дз оценки студентов");
        MarksOfStudents.addNewStudent("Петров Илья", 5);
        MarksOfStudents.addNewStudent("Иванов Геннадий", 4);
        MarksOfStudents.addNewStudent("Васильков Андрей", 5);
        MarksOfStudents.addNewStudent("Хохлов Владимир", 2);
        MarksOfStudents.addNewStudent("Марков Григорий", 3);

        MarksOfStudents.addNewStudent("Марков Григорий", 4);


        System.out.println();
        MarksOfStudents.printMarksOfStudents();


        //ДЗ 2 - задание 1 (Class RandomValues - Map<String, List<Integer>>)
        System.out.println();
        System.out.println("*****Дз - строки с рандомными значениями");
        RandomValues.addNewElement("str1");
        RandomValues.addNewElement("str2");
        RandomValues.addNewElement("str3");
        RandomValues.addNewElement("str4");
        RandomValues.addNewElement("str5");

        System.out.println();
        RandomValues.printCollection();

        System.out.println();
        RandomValues.transformationCollection();

        //ДЗ 2 - задание 2 (Class Students - Map<Integer, String>)

        System.out.println();
        System.out.println("*****Дз - список студентов");
        Students.addNewStudent(536,"Петров Илья");
        Students.addNewStudent(123,"Иванов Геннадий");
        Students.addNewStudent(29,"Хохлов Владимир");
        Students.addNewStudent(73,"Марков Григорий");
        Students.addNewStudent(1596,"Васильков Андрей");

        System.out.println();
        Students.addNewStudent(536, "Петров Илья");//Добавляем дубль
        Students.addNewStudent(1596, "Сидоров Егор");//Добавляем студента с др. именем

        System.out.println();
        Students.printAllStudents();

    }
}