package OOP.Heroes;

import javax.swing.text.Position;

import static java.lang.Math.*;
public class Place {

    int x,y;

    public Place(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    public double distance(Place target){
        return Math.sqrt((Math.pow(x - target.x, 2)  + Math.pow(y - target.y, 2)));
    }
}