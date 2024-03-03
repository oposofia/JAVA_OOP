package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   КРЕСТЬЯНИН

public class Peasant extends Character {
    public Peasant(int x, int y, String name) {

        super(x, y, name, 3, "male", 0, 1, 1, "axe");
    }


    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {

        }



}

