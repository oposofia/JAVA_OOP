package Seminar05.Task1;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Task1 {
    public static void main(String[] args) {
        Pasports pasports = new Pasports();
        pasports.add("123456", "Иванов");
        pasports.add("321456", "Васильев");
        pasports.add("234561", "Петрова");
        pasports.add("234432", "Иванов");
        pasports.add("654321", "Петрова");
        pasports.add("345678", "Иванов");

        System.out.println(pasports);
        System.out.println(pasports.findByName("Иванов"));
    }

}
