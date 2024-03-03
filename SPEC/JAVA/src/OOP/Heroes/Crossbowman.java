package OOP.Heroes;

import java.util.ArrayList;

// АРБАЛЕТЧИК

public class Crossbowman extends Character {
    protected int arrows;
    public Crossbowman(int x, int y, String name) {

        super(x, y, name, 15, "male", 3, 1, 7, "crossbow");
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
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if ((health <= 0) || (arrows <= 0)) return;
        Character vrag = (Character) minDistance(team).get(1);
        vrag.getHit(this.damage);
        arrows--;
        System.out.println("Атака. ход сделал " + this.name + " " + this.getClass().getSimpleName());
    }
}
