package Seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add(963);
        list.add("строка");
        list.add(null);
        list.add(458);
        list.add(2.546);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){ // проверяем ьип данных
//                list.remove(i);
//                i--;
//            }
//        }
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() instanceof Integer) { // проверяем ьип данных
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
