package OOP.Heroes;

import java.util.ArrayList;

public abstract class Magi extends Character{
    int mana, maxMana;
    boolean flag;
    public Magi(int x, int y, String name, int health, int speed, int armor, int damage) {
        super(x, y, name, health, speed, armor, damage);
        this.x = x;
        this.y = y;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.maxMana = 10;
        this.mana = maxMana;
        this.flag = false;
    }
    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {

        if (getHp() <= 0) {
            System.out.println("герой мертв " + name + " " + getInfo());
            return;
        }
        ArrayList<Character> sortlist = new ArrayList<>(friends);
        ArrayList<Character> deadlist = new ArrayList<>();

        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());

        for (Character character : friends) {
            if (character.getHp() == 0) deadlist.add(character);
        }
        if (deadlist.size() >= 3) {
            flag = true;
        }
        if (flag && mana == maxMana) {
            deadlist.sort((o1, o2) -> o2.speed - o1.speed);
            deadlist.getFirst().health = maxHealth;
            mana = 0;
            flag = false;
            System.out.println("Ход сделал " + getInfo() + " " + name +
                    ". Воскресил " + deadlist.getFirst().getInfo() + " " + deadlist.getFirst().name);
            return;
        }
        if (flag) {
            System.out.println("Потеряли " + deadlist.size() + " бойцов. Копим ману для воскрешения! " +
                    "Сейчас есть " + mana);
            mana++;
            return;
        }
        if (sortlist.getFirst().health < maxHealth - 1) {
            sortlist.getFirst().health += 2;
            mana -= 2;
            System.out.println("Ход сделал " + getInfo() + " " + name +
                    ". Полечил " + sortlist.getFirst().getInfo() + " " + sortlist.getFirst().name);
        }
    }
    public String getInfo() {
        return "";
    }
    @Override
    public String toString() {
        return super.toString() + ", Mana- " + mana;
    }
}
