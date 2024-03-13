package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//   РАЗБОЙНИК

public class Rogue extends Pehota {
    public Rogue(int x, int y, String name) {

        super(x, y, name, 10, 2, 2, 2);
    }


    public String getInfo() {
        return "Разбойник";
    }


}
