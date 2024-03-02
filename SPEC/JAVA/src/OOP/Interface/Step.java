package OOP.Interface;
/*
Добавить в файл интерфейса метод void step()
это будет основной метод взаимодействыия с объектами.
 Добавить интерфейс в базовый абстрактный класс. Реализовать этот
  метод во всех классах наследниках. Для начала просто заглушкой.
*/

import OOP.Heroes.Character;


import java.util.ArrayList;

public interface Step {

    void step(ArrayList<Character> team);
}
