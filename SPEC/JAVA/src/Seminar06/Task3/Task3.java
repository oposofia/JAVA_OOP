package Seminar06.Task3;

import java.util.HashSet;
import java.util.Set;

/*
Продумайте структуру класса Кот. Какие поля и методы будут актуальны
для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

1. Создайте множество, в котором будут храниться экземпляры класса
Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях.
Поместите их во множество. Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
То есть, метод должен возвращать true, только если значения во всех полях
сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты
 удалились.
 */
public class Task3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.poroda = "Британская";
        cat1.age = 10;
        cat1.owner = "Иван Васильевич";

        Cat cat2 = new Cat();
        cat2.name = "Васька";
        cat2.poroda = "Сиамская";
        cat2.age = 5;
        cat2.owner = "Мария Ивановна";

        Cat cat3 = new Cat();
        cat3.name = "Жулик";
        cat3.poroda = "Британская";
        cat3.age = 8;
        cat3.owner = "Владимир Михайлович";

        Cat cat4 = new Cat();
        cat4.name = "Маруся";
        cat4.poroda = "Шотландская";
        cat4.age = 4;
        cat4.owner = "Марфа Сергеевна";

        Cat cat5 = new Cat();
        cat5.name = "Маруся";
        cat5.poroda = "Шотландская";
        cat5.age = 4;
        cat5.owner = "Марфа Сергеевна";

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        System.out.println(cat4.equals(cat5));

        printSet(cats);

        printSet(filterAsAge(cats,8));

//        cats.forEach(cat -> System.out::println(cat));
    }

    static Set<Cat> filterAsAge(Set<Cat> cats, int age){
        Set<Cat> set = new HashSet<>();
        for (Cat cat: cats){
            if (cat.age == age){
                set.add(cat);
            }
        }
        return set;
    }
    private static void printSet(Set<Cat> set) {
        for (Cat cat: set) {
            System.out.println(cat);
        }
    }
}
