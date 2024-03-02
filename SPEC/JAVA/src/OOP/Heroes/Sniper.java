package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

// СНАЙПЕР

public class Sniper extends Character {
    protected int arrows;
    public Sniper(int x, int y, String name) {
        super(x, y, name, 20, "male", 3, 1,10, "rifle");
        this.arrows = 6;

    }
    public int powerShot(Character character){
        return 2*(character.health - this.damage);
    }

    @Override
    public void step(ArrayList<Character> team) {
        if ((health <= 0) || (arrows <= 0)) return;
        Character vrag = (Character) minDistance(team).get(1);
        vrag.getHit(this.damage);
        arrows--;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
