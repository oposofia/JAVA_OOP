package Seminar05.Task1;

import java.util.HashMap;
import java.util.Map;

public class Pasports {
    Map<String,String> map = new HashMap<>();

    void add (String pasNumber, String name){

        map.put(pasNumber, name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : map.keySet()) {
            stringBuilder.append(element);
            stringBuilder.append(" : ");
            stringBuilder.append(map.get(element));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    String findByName(String name){
        StringBuilder stringBuilder = new StringBuilder();
        for (String element: map.keySet()){
            if (map.get(element).equals(name)){
                stringBuilder.append(element);
                stringBuilder.append(" : ");
                stringBuilder.append(map.get(element));
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }


}
