import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class multidimensionarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] arr=new int[3][3];
                                                                // int [][] arr1={
                                                                //             {1,2,3},
                                                                //             {2,4,5},
                                                                //             {5,6,7}
                                                                //         };
                                                                // System.out.println(arr.length);
                                                                // System.out.println(arr1.length);
        for (int row = 0; row <arr.length; row++) {

            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col]=in.nextInt();
                
                
            }
        }
        // for (int row = 0; row <arr.length; row++) {

        //     for (int col = 0; col <arr[row].length; col++) {
        //         System.out.print( arr[row][col]+" ");
                
        //     }
        //     System.out.println();
        // }
        for (int row = 0; row <arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        
    }
    
}
