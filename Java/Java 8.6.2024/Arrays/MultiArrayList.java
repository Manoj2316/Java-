import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                list.get(i).add(in.nextInt());
            }  
            System.out.println(list);
        }
        // for (int i = 0; i < 3 ;i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println(list);
                
        //     }
            
        // }
    }
}
