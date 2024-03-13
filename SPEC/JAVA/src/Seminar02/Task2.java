package Seminar02;
/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddu";
        System.out.println(str_zip(str));
    }
    static String str_zip(String str){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length();i++){
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            } else{
                result.append(str.charAt(i-1));
                if (count > 1){
                    result.append(count);
                }
                count = 1;
            }

        }
        result.append(str.charAt(str.length()-1));
        if (count > 1){
            result.append(count);
        }
        return result.toString();
    }
}
