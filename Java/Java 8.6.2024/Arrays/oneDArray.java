package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class oneDArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int[] arr= new int [5];
         String[] arr1=new String[5];
                // arr[0]=23;
                // arr[1]=9;
                // arr[2]=10;
                // arr[3]=11;
                // arr[4]=16;
        // System.out.println(arr[0]);
            // int[]arr1={1,2,3,4,5};
            // System.out.println(arr1[2]);
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the 5 num:");
                arr[i]=in.nextInt();
                
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print("Enter the  5 char:");
                arr1[i]=in.next();
                
            }
            // for (int element : arr) {
            //     System.out.print(element+" ");
            // }
            System.out.print(Arrays.toString(arr));
            System.out.print(Arrays.toString(arr1));
            arr1[2]="M";
            System.out.print(Arrays.toString(arr1));
        
    }
}

    
    