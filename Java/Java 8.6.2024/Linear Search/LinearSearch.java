import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23,46,94,2,3,4,16,56,98,58};
        int target=16;
        int ans=Linear(arr,target);
        System.out.println(ans);
    }
    static int Linear(int[] arr,int target){
        if (arr.length==0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                System.out.println("The target no is" + element + " is placed on index " + i);
                System.out.println();
                return i;
               // return element;
               
            }     
            // System.out.print(element+" ");
            // System.out.print(i+" ");
           
        }
        
        return -1;
        

    }


    
}
