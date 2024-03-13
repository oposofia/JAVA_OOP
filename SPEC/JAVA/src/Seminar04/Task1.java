package Seminar04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        test(list1);
        test(list2);

        test2(list1);
        test2(list2);
    }

    private static void test(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i); // если добавлять эл-т в конец, то ArrayList работает быстрее
            // если в начало, то LinkedList гораздо быстрее,
            // если задаем какой-то индекс, то LinkedList сильно проседает, он плохо работает с индексами
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName()+": " + (timeFinish - timeStart));
    }

    static void test2(List<Integer> list){
        long sum = 0;
        long timeStart = System.currentTimeMillis();
        for (int i : list) {
            sum += i;
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName()+": " + (timeFinish - timeStart));
    }
}
