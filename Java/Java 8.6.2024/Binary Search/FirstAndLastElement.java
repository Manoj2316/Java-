import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=FindIndex(arr,target);
        System.out.println("The index of Target Value is "+Arrays.toString(ans));
    }
    static int[] FindIndex(int[] arr,int target){
        int first = -1;
        int last= -1;
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                if(first == -1){
                    first=i;
                }
                last =i;
            }            
        }

        return new int[]{first,last};
    }

}
