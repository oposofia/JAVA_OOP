package OOP.Heroes;

import java.util.ArrayList;

public abstract class Luchniki extends Character{
    protected int arrows;
    public Luchniki(int x, int y, String name, int health, int speed, int armor, int damage) {
        super(x, y, name, health, speed, armor, damage);
        this.x = x;
        this.y = y;
        this.name = name;
        this.health = health;
        this.speed = 3;
        this.armor = armor;
        this.damage = damage;
        this.arrows = 10;
    }
    /*
       Доработать классы лучников. Лучник должен во первых проверить жив ли
        он и есть ли у него стрелы, если нет то завершить метод.
        Если всё да, то найти ближайшего противника и выстрелить по немы и,
         соответственно потратить одну стрелу. Реализовать весь функционал
         лучников в методе step().
        */
    @Override
    public String toString() {
        return super.toString() + ", \u27b6- " + arrows;
    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if (health <= 0) {
            health = 0;
            System.out.println("Герой мертв " + name + " " + getInfo());
            return;
        }
        if (arrows <= 0) return;
        Character vrag = (Character) minDistance(team).get(1);
        if (vrag == null) return;
        vrag.getHit(this.damage);
        System.out.println("Атака. Ход сделал " + name + " " + getInfo() +
                ". Урон нанесен " + vrag.name + " " + vrag.getInfo());


        for (Character character : friends) {
            if (character.getInfo().equals("Фермер") && !((Peasant)character).flag){
                ((Peasant)character).flag = true;
                return;
            }
        }
        arrows --;
    }

    public Integer getCountArrow(){
        return arrows;
    }
    public String getInfo() {
        return "";
    }
}
