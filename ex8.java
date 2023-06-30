package exercise2Collection;
import java.util.ArrayList;
import java.util.TreeSet;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        
        TreeSet<String> set = new TreeSet<String>();
        set.addAll(list);
        
        System.out.println("Elements in TreeSet: " + set);
    }
}

