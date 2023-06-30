package exercise2Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ex9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        
        HashSet<String> set = new HashSet<String>();
        set.addAll(list);
        
        System.out.println("Elements in HashSet: " + set);
    }
}

