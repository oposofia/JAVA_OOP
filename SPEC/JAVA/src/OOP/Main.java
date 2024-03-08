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
    public static ArrayList<Character> holyTeam = new ArrayList<>();
    public static ArrayList<Character> darkTeam = new ArrayList<>();
    public static ArrayList<Character> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        int x, y;
        init();

        System.out.println();
        System.out.println("TEAM #1:\n");
        holyTeam.forEach(n->n.toString());
        System.out.println();
        System.out.println("TEAM #2:\n");
        darkTeam.forEach(n->n.toString());

    /*
    Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле.
    Крестьянин = 0,
    маги=1,
    пехота=2,
    лучники=3.
    В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих команд,
    а с наименьшей в конце.
     */

    allTeam.addAll(holyTeam);
    allTeam.addAll(darkTeam);
    allTeam.sort(new Comparator<Character>() {
        @Override
        public int compare(Character o1, Character o2) {
            return o2.getSpeed() - o1.getSpeed();
        }
    });

//    allTeam.forEach(n -> n.print());
//        System.out.println();
        Scanner scanner = new Scanner((System.in));
        boolean flag = true;

        while (true) {
            View.view();
            scanner.nextLine();
            int sum1HP = 0;
            int sum2HP = 0;
            for (Character character: holyTeam){
                sum1HP += character.getHp();
            }
            for (Character character: darkTeam){
                sum2HP += character.getHp();
            }
            if (sum1HP == 0){
                System.out.println("Победа команды darkTeam");
                flag = false;
            }
            if (sum2HP == 0){
                System.out.println("Победа команды holyTeam");
                flag = false;
            }
            for (Character character : allTeam) {
                if (holyTeam.contains(character)) character.step(darkTeam,holyTeam);
                else character.step(holyTeam, darkTeam);
            }

        }
    }



    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static void init(){
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(7)) {
                case 0: holyTeam.add(new Crossbowman(i, 1, getName()));
                    break;
                case 1: holyTeam.add(new Monk(i, 1, getName()));
                    break;
                case 2: holyTeam.add(new Peasant(i, 1, getName()));
                    break;
                case 3: holyTeam.add(new Rogue(i, 1, getName()));
                    break;
                case 4: holyTeam.add(new Sniper(i, 1, getName()));
                    break;
                case 5: holyTeam.add(new Spearmen(i, 1, getName()));
                    break;
                case 6: holyTeam.add(new Wizard(i, 1, getName()));
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    darkTeam.add(new Crossbowman(i, 10, getName()));
                    break;
                case 1:
                    darkTeam.add(new Monk(i, 10, getName()));
                    break;
                case 2:
                    darkTeam.add(new Peasant(i, 10, getName()));
                    break;
                case 3:
                    darkTeam.add(new Rogue(i, 10, getName()));
                    break;
                case 4:
                    darkTeam.add(new Sniper(i, 10, getName()));
                    break;
                case 5:
                    darkTeam.add(new Spearmen(i, 10, getName()));
                    break;
                case 6:
                    darkTeam.add(new Wizard(i, 10, getName()));
                    break;
            }
        }
    }
}
