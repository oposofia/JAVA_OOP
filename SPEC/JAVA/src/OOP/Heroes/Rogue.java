package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   РАЗБОЙНИК

public class Rogue extends Character {
    public Rogue(int x, int y, String name) {

        super(x, y, name, 10, "male", 2, 2, 2, "knife");
    }

    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {
        if (health <= 0) {
            System.out.println("герой мертв " + this.name + " " + this.getClass().getSimpleName());
            return;
        }
        Character vrag = (Character) minDistance(team).get(1);
        if (position.distance(vrag.position) < 2){
            vrag.getHit(this.damage);
            System.out.println("Атака. ход сделал " + this.name + " " + this.getClass().getSimpleName());
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
        System.out.println("ход сделал " + this.name + " " + this.getClass().getSimpleName()+
                "(" + newposition.x + ", " + newposition.y + ")");

    }
}
