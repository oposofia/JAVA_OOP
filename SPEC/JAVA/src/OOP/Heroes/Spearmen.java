package OOP.Heroes;

import OOP.Heroes.Character;

import java.util.ArrayList;

//    КОПЕЙЩИК

public class Spearmen extends Pehota {
    public Spearmen(int x, int y, String name) {

        super(x, y, name, 10, 2, 5, 5);
    }

    public String getInfo() {
        return "Копейщик";
    }
}
