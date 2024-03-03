package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   КОЛДУН

public class Wizard extends Character {
    public Wizard(int x, int y, String name) {

        super(x, y, name, 5, "male", 1, 1, 1, "poison");
    }

    public void fireBall(Character char1, Character char2, Character char3){
        char1.health -= this.damage;
        char2.health -= this.damage;
        char3.health -= this.damage;
    }


    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {

    }
}
