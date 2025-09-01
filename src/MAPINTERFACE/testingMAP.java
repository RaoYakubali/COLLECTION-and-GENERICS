package MAPINTERFACE;

import java.util.HashMap;
import java.util.Map;

public class testingMAP {
    public static void main(String[] args) {
        Map<String, Integer>  map = new HashMap<>();
        map.put("prashant",34);
        map.put("yakub", 100);
        map.put("ram", 45);
        map.put("sohan",45);
        System.out.println(map.size());
        System.out.println(map.get("yakub")); //now marks about yakyb
        System.out.println(map.containsKey("sohan")); // is it present or not check that if present say true
        System.out.println(map.remove("ram"));//remove ram
        System.out.println(map.size());// size of kay is 3 now
    }
}
