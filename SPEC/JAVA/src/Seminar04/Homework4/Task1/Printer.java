package Seminar04.Homework4.Task1;
/*
Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks
реализуйте разворот этого списка без использования встроенного функционала.

Пример

// Дан
[1, One, 2, Two]

// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]
 */
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> llRevert = new LinkedList<>();
        for (int i = (ll.size() - 1); i >= 0; i--) {
            llRevert.add(ll.get(i));
        }
        return  llRevert;
    }
}

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer{
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            LLTasks answer = new LLTasks();
            System.out.println(ll);
            LinkedList<Object> reversedList = answer.revert(ll);
            System.out.println(reversedList);
        }
    }
