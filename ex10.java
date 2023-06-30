package exercise2Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ex10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        
        HashSet<String> set = new HashSet<String>(list);
        list.clear();
        list.addAll(set);
        
        System.out.println("Elements in ArrayList: " + list);
    }
}
