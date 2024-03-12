package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

// СНАЙПЕР

public class Sniper extends Character {
    protected int arrows;
    public Sniper(int x, int y, String name) {
        super(x, y, name, 20, 3, 1, 7);
        this.arrows = 6;

    }
    public int powerShot(Character character){
        return 2*(character.health - this.damage);
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6- " + arrows;
    }
    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if ((health <= 0) || (arrows <= 0)) return;
        Character vrag = (Character) minDistance(team).get(1);
        if (vrag == null) return;
        vrag.getHit(this.damage);
        for (Character character : friends) {
            if (character.getInfo().equals("Фермер") && !((Peasant)character).flag){
                ((Peasant)character).flag = true;
                return;
            }
        }
        arrows--;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String getInfo() {
        return "Снайпер";
    }
}
