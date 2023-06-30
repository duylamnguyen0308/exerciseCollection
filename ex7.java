package exercise2Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ex7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        
        System.out.println("Before sorting: " + list);
        
        Collections.sort(list);
        
        System.out.println("After sorting: " + list);
    }
}
