package exercise2Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ex2 {
    public static void main(String[] args){
        List<String> arr=new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("orange");
        arr.add("banana");
        System.out.println("mang arr la: " + arr);
        HashSet<String> hashSet=new HashSet<>( arr );
        System.out.println("mang hashset la: "+ hashSet);
    }
}
