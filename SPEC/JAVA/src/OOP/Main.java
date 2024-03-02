package OOP;
/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер,
Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит
8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов
атаковать, вылечить итд). Создать абстрактный класс и иерархию
наследников.
*/

import OOP.Heroes.*;
import OOP.Heroes.Character;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        ArrayList<Character> team1 = new ArrayList<>();
        ArrayList<Character> team2 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            switch (new Random().nextInt(7)) {
                case 0: team1.add(new Crossbowman(i, 0, getName()));
                        break;
                case 1: team1.add(new Monk(i, 0, getName()));
                        break;
                case 2: team1.add(new Peasant(i, 0, getName()));
                        break;
                case 3: team1.add(new Rogue(i, 0, getName()));
                    break;
                case 4: team1.add(new Sniper(i, 0, getName()));
                    break;
                case 5: team1.add(new Spearmen(i, 0, getName()));
                    break;
                case 6: team1.add(new Wizard(i, 0, getName()));
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new Crossbowman(i, 9, getName()));
                    break;
                case 1:
                    team2.add(new Monk(i, 9, getName()));
                    break;
                case 2:
                    team2.add(new Peasant(i, 9, getName()));
                    break;
                case 3:
                    team2.add(new Rogue(i, 9, getName()));
                    break;
                case 4:
                    team2.add(new Sniper(i, 9, getName()));
                    break;
                case 5:
                    team2.add(new Spearmen(i, 9, getName()));
                    break;
                case 6:
                    team2.add(new Wizard(i, 9, getName()));
                    break;
            }
        }
        System.out.println("TEAM #1:\n");
        team1.forEach(n->n.printName());
        System.out.println();
        System.out.println("TEAM #2:\n");
        team2.forEach(n->n.printName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер атакующей команды: ");
        int num = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите класс атакующего персонажа: ");
        String voin = scanner1.nextLine();
        Character nearVrag = null;
        if (num == 1) {
            for (int i = 0; i < team1.size(); i++) {
                if (team1.get(i).getClass().getSimpleName().equals(voin)) {
                    nearVrag = (Character) team1.get(i).minDistance(team2).get(1);
                    System.out.println(voin + "(" + team1.get(i).x + "," + team1.get(i).y +
                            ") до " +
                            nearVrag.getClass().getSimpleName() + " (" + nearVrag.x + "," + nearVrag.y + ") " +
                            " = " + (double) (team1.get(i).minDistance(team2).get(0)));
                }
            }
        } else if (num == 2) {
            for (int i = 0; i < team2.size(); i++) {
                if (team2.get(i).getClass().getSimpleName().equals(voin)) {
                    nearVrag = (Character) team2.get(i).minDistance(team1).get(1);
                    System.out.println(voin + "(" + team2.get(i).x + "," + team2.get(i).y +
                            ") до " +
                            nearVrag.getClass().getSimpleName() + " (" + nearVrag.x + "," + nearVrag.y + ") " +
                            " = " + (double) (team2.get(i).minDistance(team1).get(0)));
                }
            }
        } else System.out.println("Некорректный ввод");

    /*
    Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле.
    Крестьянин = 0,
    маги=1,
    пехота=2,
    лучники=3.
    В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих команд,
    а с наименьшей в конце.
     */

    ArrayList<Character> teamAll = new ArrayList<>();
    teamAll.addAll(team1);
    teamAll.addAll(team2);
    teamAll.sort(new Comparator<Character>() {
        @Override
        public int compare(Character o1, Character o2) {
            return o2.getSpeed() - o1.getSpeed();
        }
    });

    teamAll.forEach(n -> n.print());
    }



    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
