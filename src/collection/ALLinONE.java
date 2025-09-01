package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ALLinONE {

        public static void main(String[] args) {
            // List Example
            ArrayList<String> list = new ArrayList<>();

            list.add("Yakub");
            list.add("Ali");
            list.add("Engineer");

            System.out.println("List: " + list);

            // Set Example
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(10); // Duplicate add nahi hoga

            System.out.println("Set: " + set);

            // Map Example
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Java");
            map.put(2, "Python");

            System.out.println("Map: " + map);
        }
    }


