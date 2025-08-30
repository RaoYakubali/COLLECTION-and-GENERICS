package collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        System.out.println(name.add("prashannt"));
        System.out.println(name.add("yakub"));
        System.out.println(name.add("kgcoding"));
        Utility.print(name);

        System.out.println(name.add("prashanr"));
        System.out.println(name.add("yakub"));
        Utility.print(name);
    }
}
