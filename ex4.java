package exercise2Collection;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,2,3,4,65,98,2));
            largeNumber(arrayList);
    }

    static void largeNumber(ArrayList<Integer> arrayList){
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong mang la "+ max);
    }
}
