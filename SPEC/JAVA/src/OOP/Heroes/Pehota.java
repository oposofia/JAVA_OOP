package OOP.Heroes;

import java.util.ArrayList;

public abstract class Pehota extends Character{
    public Pehota(int x, int y, String name, int health, int speed, int armor, int damage) {
        super(x, y, name, health, 2, armor, damage);
        this.x = x;
        this.y = y;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
    }
    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if (health <= 0) {
            System.out.println("Герой мертв " + name + " " + getInfo());
            return;
        }
        Character vrag = (Character) minDistance(team).get(1);
        if (vrag == null) return;
        if (position.distance(vrag.position) < 2){
            vrag.getHit(this.damage);
            System.out.println("Атака. ход сделал " + name + " " + getInfo() +
                    ". Урон нанесен " + vrag.name + " " + vrag.getInfo());
            return;
        }
        Place diff = position.getDifference(vrag.position);
        Place newposition = new Place(position.x, position.y);
        if (Math.abs(diff.x) > Math.abs(diff.y)){
            newposition.x += diff.x < 0? 1: -1;
        } else {
            newposition.y += diff.y < 0? 1: -1;
        }
        for (Character friend : friends) {
            if (friend.position.equals(newposition)) return;
        }
        this.position = newposition;
        System.out.println("Ход сделал " + name + " " + getInfo()+
                "(" + newposition.x + ", " + newposition.y + ")");
    }
    public String getInfo() {
        return "";
    }
}
