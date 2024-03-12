package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//    КОПЕЙЩИК

public class Spearmen extends Character {
    public Spearmen(int x, int y, String name) {

        super(x, y, name, 10, 2, 5, 5);
    }


    @Override
    public void step(ArrayList<Character> team, ArrayList<Character> friends) {

        if (health <= 0) {
            System.out.println("герой мертв " + this.name + " " + this.getClass().getSimpleName());
            return;
        }
        Character vrag = (Character) minDistance(team).get(1);
        if (vrag == null) return;
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
            if (friend.position.equals(newposition) && friend.health > 0) return;
        }
        this.position = newposition;
        System.out.println("ход сделал " + this.name + " " + this.getClass().getSimpleName()+
                "(" + newposition.x + ", " + newposition.y + ")");
    }
    public String getInfo() {
        return "Копейщик";
    }
}
