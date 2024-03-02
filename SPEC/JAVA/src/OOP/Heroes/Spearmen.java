package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//    КОПЕЙЩИК

public class Spearmen extends Character {
    public Spearmen(int x, int y, String name) {

        super(x, y, name, 10, "male", 2, 5, 10, "spear");
    }


    @Override
    public void step(ArrayList<Character> team) {

    }
}
