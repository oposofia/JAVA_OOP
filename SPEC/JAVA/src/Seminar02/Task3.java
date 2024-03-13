package Seminar02;
/*
Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо
и справа налево.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        System.out.println(polindrom(str));
    }
    static boolean polindrom(String str){
        str = str.toLowerCase();
        str = str.replace(" ","");
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    static boolean polindrom2(String str){
        str = str.toLowerCase();
        str = str.replace(" ","");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }
}
