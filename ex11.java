package exercise2Collection;
import java.util.ArrayList;

public class ex11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(list);
        
        System.out.println("Elements in newList: " + newList);
    }
}
