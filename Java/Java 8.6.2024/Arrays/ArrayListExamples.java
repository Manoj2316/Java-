import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(16);
        list.add(126);
        list.add(163);
        list.add(165);
        System.out.println(list);
        list.remove(2);
        list.set(1, 23);
        System.out.println(list.contains(163));
        System.out.println(list);
         for(int i=0;i<5;i++){
             list.add(in.nextInt());

         }
        // for (int i = 0; i < 2; i++) {
        //     System.out.println(list.get(i));
           
            
        // }
        System.out.println(list);
        
    }
    
}
