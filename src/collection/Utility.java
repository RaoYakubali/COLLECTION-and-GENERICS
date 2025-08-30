package collection;

import java.util.Collection;

public class Utility {
    public static<E> void print(Collection<E> collection){
        System.out.println("collection is: "); for (E coll : collection) {
            System.out.printf("%s" ,coll.toString());

        }
        System.out.println();
    }
}
