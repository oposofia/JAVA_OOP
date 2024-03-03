package OOP.Heroes;

import OOP.Interface.Step;

import java.util.ArrayList;

public abstract class Character implements Step {
    String name, gender, weapon;
    int health, maxHealth, speed, armor, damage;
    public int x;
    public int y;
    Place position;

    public Character(int x, int y, String name, int health, String gender,
                     int speed, int armor, int damage, String weapon){
        position = new Place(x,y);
        maxHealth = health;
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.weapon = weapon;
        this.x = x;
        this.y = y;
    }
    protected int go(int place){
        return place-speed;
    }

    protected void getHit(float damage){
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;

    }

    protected int getDamage(Character character){
        return health- character.damage;
    }

    protected void retreat(){
        System.out.println("персонаж сбежал с поля боя");
    }

    public boolean heroIsDead(Character target){
        if (target.health <= 0){
            System.out.println(target.name + "is dead.");
            return true;
        } else {
            System.out.println(target.name + "is alive.");
            return false;
        }
    }
    public void print(){
        System.out.println("x = " + position.x + " y = " + position.y + " Class: " +
                getClass().getSimpleName() + " Name: " + name + "   Health: " + health + "   Gender: " + gender +
                "   Speed: " + speed + "   Armor: " + armor + "   Damage: " + damage +
                "   Weapon: " + weapon);
    }

    public void printName(){
        System.out.println("x = " + x + " y = " + y + " Class: " +
                getClass().getSimpleName() + " Name: " + name);
    }

    public ArrayList<Object> minDistance(ArrayList<Character> team){
        double minDist = Double.MAX_VALUE;
        ArrayList<Object> list = new ArrayList<>();
        Character nearChar = null;
        for (Character hero : team) {
            if (position.distance(hero.position) < minDist && hero.health > 0){
                minDist = position.distance(hero.position);
                nearChar = hero;
            }
        }
        list.add(minDist);
        list.add(nearChar);
        return list;
    }

    public int getSpeed() {
        return speed;
    }





}
