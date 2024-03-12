package OOP.Heroes;
import OOP.Heroes.Character;
import java.util.*;
//  МОНАХ

public class Monk extends Character {
    int mana, maxMana;
    boolean flag;
    public Monk(int x, int y, String name) {

        super(x, y, name, 30, 1, 1, 1);
        maxMana = 10;
        mana = maxMana;
        flag = false;
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

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {

        if (getHp() <= 0) return;
        ArrayList<Character> sortlist = new ArrayList<>(friends);
        ArrayList<Character> deadlist = new ArrayList<>();

        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());

        for (Character character: friends){
            if (character.getHp() == 0) deadlist.add(character);
        }
        if (deadlist.size() >= 3) {
            flag = true;
            System.out.println("Копим ману для воскрешения! Сейчас есть " + mana);
        }
        if (flag && mana == maxMana) {
            deadlist.sort((o1, o2) -> o2.speed - o1.speed);
            deadlist.getFirst().health = maxHealth;
            mana = 0;
            flag = false;
            System.out.println("Воскресил " + deadlist.getFirst().getInfo() + "а "+ deadlist.getFirst().name + "а");
            return;
        }
        if (flag){
            mana ++;
            return;
        }
        sortlist.getFirst().health = maxHealth;
        mana -= 2;
        System.out.println("Вылечил " + sortlist.getFirst().getInfo() +" "+ sortlist.getFirst().name);
    }
    public String getInfo() {
        return "Монах";
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana- " + mana;
    }
}
