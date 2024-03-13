package Seminar06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
 цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве
и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
 количество чисел в массиве.
 */
public class Task2 {
    public static void main(String[] args) {
        Integer[] array = arrayCreate(1000,0,24);
        double p = percent(array);
        System.out.println(p);
    }

    static Integer[] arrayCreate(int length, int start, int finish) {
        Integer[] array = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(start, finish + 1);
        }
        return array;
    }

    static double percent(Integer[] array){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        return set.size()*100.0/ array.length;//(double)(set.size()*100 )/ (double)(array.length)
    }
}
