package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        numlist.add(5);
        numlist.add(3);
        numlist.add(-5);

        Utility.print(numlist);//original
        Collections.sort(numlist);// collections sort
        Collections.reverse(numlist);// it can reverse 
        Utility.print(numlist);
    }
}
