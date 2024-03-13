package OOP.Heroes;
import OOP.Heroes.Character;
import java.util.*;
//  МОНАХ

public class Monk extends Magi {
    public Monk(int x, int y, String name) {
        super(x, y, name, 30, 1, 1, 1);
    }
    /*
    public void heal(Character character){
        if ((character.health)+5 > character.maxHealth){
            character.health = character.maxHealth;
        } else{
            character.health += 5;
        }
    }

     */

    public String getInfo() {
        return "Монах";
    }
}
