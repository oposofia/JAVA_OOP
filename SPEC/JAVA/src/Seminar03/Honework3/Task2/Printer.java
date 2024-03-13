package Seminar03.Honework3.Task2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/*
Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого
массива. Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers
принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список
ArrayList<Integer>
 */
class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);

        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0){
                System.out.println("удаляем элемент " + arrayList.get(i));
                System.out.println(arrayList);
                arrayList.remove(i--);

            }
            else {
                System.out.println("ничего не удаляем " + arrayList.get(i));
                System.out.println(arrayList);
            }

        }
        System.out.println(arrayList);



    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{2, 4, 6, 8, 9, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}
