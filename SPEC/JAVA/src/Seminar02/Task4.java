package Seminar02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Напишите метод, который составит строку, состоящую из 100 повторений
слова TEST и метод, который запишет эту строку в простой текстовый файл,
обработайте исключения.
 */
public class Task4 {
    public static void main(String[] args) {
        String s = "test";
        String filePath = "C:\\Users\\sko88\\OneDrive\\Рабочий стол\\GB\\SPEC\\JAVA\\src\\Seminar02\\test.txt";
        int n = 10;
        String s1 = repeat(s, n);
//        System.out.println(s1);
        writeToFile(s1, filePath);

    }

    static void writeToFile(String s, String filePath) {
        Logger logger = Logger.getAnonymousLogger();
        String logPath = "C:\\Users\\sko88\\OneDrive\\Рабочий стол\\GB\\SPEC\\JAVA\\src\\Seminar02\\log.txt";
        FileHandler fh = null;
        try {
            fh = new FileHandler(logPath, true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fh.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);

        try (FileWriter fileWriter = new FileWriter(filePath, true)){
            fileWriter.write(s);
            fileWriter.write("\n");
            logger.info("Запись в файл была успешна");
        } catch (IOException e) {
            logger.warning("Не удалось записать текст в файл");
            e.printStackTrace();
        }

        fh.close();
    }

    static String repeat(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
