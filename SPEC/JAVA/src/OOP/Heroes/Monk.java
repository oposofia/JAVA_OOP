package OOP.Heroes;


import OOP.Heroes.Character;

import java.util.ArrayList;


//  МОНАХ

public class Monk extends Character {
    public Monk(int x, int y, String name) {
        super(x, y, name, 30, "male", 1, 1, 1, "health");
    }
    public void heal(Character character){
        if ((character.health)+5 > character.maxHealth){
            character.health = character.maxHealth;
        } else{
            character.health += 5;
        }
    }

    @Override
    public void step(ArrayList<Character> team) {

    }
}
