package Seminar01.Homework.Task2;
/*
Напишите функцию printPrimeNums, которая выведет на экран
 все простые числа в промежутке от 1 до 1000, каждое на новой строке.
 */
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i=2; i<=1000; i++){
            int count_mnoz = 0;
            for (int j=2; j<=i; j++){
                if (i % j == 0){
                    count_mnoz++;
                }
            }
            if (count_mnoz == 1){
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
