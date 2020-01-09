package datastructure.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        //create a map of <integer, string>
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        //replace 3's value with "Tres"
        map.replace(3, "Tres");

        //remove key 5
        map.remove(5);



        //how can we traverse a map?
        for (Map.Entry m : map.entrySet()) {
            System.out.println("key = " + m.getKey() + "value =  " + m.getValue());
        }





    }
}
