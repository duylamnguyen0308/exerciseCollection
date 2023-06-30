package exercise2Collection;

import java.util.HashMap;

public class ex5 {
    public static void main (String[] args){
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 82);
        scores.put("john wick", 100);
        scores.put("Deep", 70);
        for (String name : scores.keySet()){
            int score = scores.get(name);
            System.out.println(name + ": "+ score);
        }
    }
}
