package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   РАЗБОЙНИК

public class Rogue extends Character {
    public Rogue(int x, int y, String name) {

        super(x, y, name, 10, "male", 2, 2, 2, "knife");
    }

    @Override
    public void step(ArrayList<Character> team) {

    }
}
