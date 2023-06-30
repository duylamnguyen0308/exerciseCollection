package exercise2Collection;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4));
        sumArr(arr);
    }
    public static void sumArr(List<Integer> arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        System.out.println("tong cua mang la: " + sum);
    }
}