package Seminar01;
/*
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.
 */

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {3,2,5,3,1,1,2,3};
        int val = 3;
        int[] result = sort(array, val);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));

    }
    static int[] sort(int[] arr, int value){
        int[] new_array = new int[arr.length];
        Arrays.fill(new_array,value);
        for (int i = 0, j = 0; i< arr.length; i++){
            if (arr[i] != value){
                new_array[j] = arr[i];
                j++;
            }
        }
        return new_array;
    }
}
