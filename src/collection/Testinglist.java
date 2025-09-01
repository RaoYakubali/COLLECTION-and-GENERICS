package collection;

import java.util.ArrayList;
import java.util.List;

public class Testinglist {
    public static void main(String[] args) {
        List strlist = new ArrayList();
        strlist.add("yakub");
        strlist.add("rao");

        strlist.add(1,"yakub");
        strlist.remove("rao");// remove

        for (int i = 0; i < strlist.size(); i++) {
            System.out.println(strlist.get(i));
        }
    }
}