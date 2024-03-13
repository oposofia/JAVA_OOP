package Seminar01;
/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
 */

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] arr_str = str.split(" ");
        String new_str = "";
        for (int i = arr_str.length-1; i >=0 ; i--) {
            new_str += arr_str[i] + " ";
        }
        System.out.println(new_str.trim()); // trim() - убирает пробелы в начале и конце строки
    }
}
