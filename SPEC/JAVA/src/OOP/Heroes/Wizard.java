package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   КОЛДУН

public class Wizard extends Magi {
    public Wizard(int x, int y, String name) {

        super(x, y, name, 5, 1, 1, 1);
    }
/*
    public void fireBall(Character char1, Character char2, Character char3){
        char1.health -= this.damage;
        char2.health -= this.damage;
        char3.health -= this.damage;
    }

 */

    public String getInfo() {
        return "Волшебник";
    }
}
