package Seminar04;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя
введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку
из памяти.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean flag = true;
        while (flag){
            String text = scanner.nextLine();
            switch (text){
                case "print":
                    /*for (int i = list.size(); i >= 0 ; i--) {
                        System.out.println(list.get(i));
                    }*/
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.remove(list.size()-1);
                    break;
                case "end":
                    flag = false;
                    break;
                default:
                    list.add(text);
                    break;
            }
        }
    }
}
