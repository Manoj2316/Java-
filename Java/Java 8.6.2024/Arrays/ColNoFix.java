import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class colNoFix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] arr= new int[3][];
        int [][] arr1={
            {1,2,3},
            {4,5},
            {6,7,8}
        };
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }
        for(int row=0;row<arr1.length;row++){
            for (int col = 0; col < arr1[row].length; col++) {
                // arr1[row][col]=in.nextInt();
                System.out.print(arr1[row][col]+" ");
                
            }
            System.out.println();
        
        }
        System.out.println();
         for(int[] a : arr1){
                  System.out.println(Arrays.toString(a));
         }
    }
    
}
