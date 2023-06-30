package exercise2Collection;

import java.util.ArrayList;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        boolean containsApple = list.contains("apple");
        boolean containsGrape = list.contains("grape");
        
        System.out.println("List contains apple: " + containsApple); 
        System.out.println("List contains grape: " + containsGrape); 
    }
}