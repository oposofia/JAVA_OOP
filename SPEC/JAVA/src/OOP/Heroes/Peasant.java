package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   КРЕСТЬЯНИН

public class Peasant extends Character {
    protected int arrows;
    protected boolean flag;
    public Peasant(int x, int y, String name) {

        super(x, y, name, 3, 0, 1, 1);
        this.arrows = 10;
        flag = false;
    }


    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if (this.health <= 0) return;
        flag = false;

    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6- " + arrows;
    }
    public String getInfo() {
        return "Фермер";
    }




}

