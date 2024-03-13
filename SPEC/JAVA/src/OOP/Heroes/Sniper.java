package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

// СНАЙПЕР

public class Sniper extends Luchniki {
    public Sniper(int x, int y, String name) {
        super(x, y, name, 20, 3, 1, 7);
        this.arrows = 6;
    }
//    public int powerShot(Character character){
//        return 2*(character.health - this.damage);
//    }

    public String getInfo() {
        return "Снайпер";
    }
}
