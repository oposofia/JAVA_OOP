package Seminar03.Honework3.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.io.ObjectInputFilter.merge;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        int half = a.length/2;
        return merge(Arrays.copyOfRange(a,0,half), Arrays.copyOfRange(a,half,a.length));
    }
    public static int[] merge(int[] left, int[] right){
        if (left.length > 1){
            left = mergeSort(left);
        }
        if (right.length > 1){
            right = mergeSort(right);
        }
        int[] res = new int[left.length+ right.length];
        for (int i = 0, m=0, n=0; i < res.length ; i++) {
            if (m >= left.length){
                res[i] = right[n++];
            } else if (n >= right.length){
                res[i] = left[m++];
            } else {
                if (left[m] < right[n]){
                    res[i] = left[m++];
                } else {
                    res[i] = right[n++];
                }
            }
        }
        return res;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4, 8};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}