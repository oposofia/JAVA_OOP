package OOP.Heroes;

import java.util.ArrayList;

// АРБАЛЕТЧИК

public class Crossbowman extends Luchniki {

    public Crossbowman(int x, int y, String name) {

        super(x, y, name, 15, 3, 1, 7);
    }

    public String getInfo() {
        return "Арбалетчик";
    }


}
