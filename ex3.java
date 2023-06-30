package exercise2Collection;

import java.util.Collections;
import java.util.LinkedList;

public class ex3 {
    public static void main (String[] args) {
        LinkedList<String> link= new LinkedList<>();
        link.add("apple");
        link.add("banana");
        link.add("orange");
        System.out.println("original List: " + link);
        Collections.reverse(link);
        System.out.println("Reverse List: " + link);
    }
}
