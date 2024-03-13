package Seminar06.Task3;

public class Cat {
    String name;
    String poroda;
    int age;
    String owner;

    @Override
    public String toString() {
        return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)){
            return  false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals(cat.owner);
    }
}
