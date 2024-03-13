package Seminar02;
/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов c1 и
c2, начиная с c1.
Ответ: c1c2c1…c2 (всего N символов)
 */
public class Task1 {
    public static void main(String[] args) {
        int length = 11;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(builder(c1, c2, length));
    }

    static String builder(char c1, char c2, int length){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i< length; i++){
            if (i % 2 == 0){
                result.append(c1);
            } else {
                result.append(c2);
            }
        }

        return result.toString();
    }

}
