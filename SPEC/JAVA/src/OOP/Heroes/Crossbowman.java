package OOP.Heroes;

import java.util.ArrayList;

// АРБАЛЕТЧИК

public class Crossbowman extends Character {
    protected int arrows;
    public Crossbowman(int x, int y, String name) {

        super(x, y, name, 15, 3, 1, 7);
    this.arrows = 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6- " + arrows;
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
        if (vrag == null) return;
        vrag.getHit(this.damage);

        for (Character character : friends) {
            if (character.getInfo().equals("Фермер") && !((Peasant)character).flag){
                ((Peasant)character).flag = true;
                return;
            }
        }
        arrows --;
    }

    public String getInfo() {
        return "Арбалетчик";
    }

    public Integer getCountArrow(){
        return arrows;
    }
}
