package Seminar02.Homework2.Task1;
/*
Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные (параметры) для фильтрации приведены в виде json-строки в
примере ниже. Если значение null, то параметр не должен попадать в
запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает
на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: Строка sql-запроса:

select * from students where
Параметры для фильтрации:

        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'
        */
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder result = new StringBuilder();
        result.append(QUERY);
        String[] parParams = PARAMS.split(",");
        for (int i = 0; i < parParams.length; i++) {
            String part = parParams[i];
            part = part.replaceAll("[{}\"]", "");
            if (!part.contains("null")){
                String[] part12 = part.split(":");
                result.append(part12[0]);
                result.append("='");
                result.append(part12[1]);
                result.append("' and");
            }
        }
        return new StringBuilder (result.substring(0, result.length() - 4));
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}