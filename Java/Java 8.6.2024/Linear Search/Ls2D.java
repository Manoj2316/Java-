import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class Ls2D {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4,5},
            {65,33,55,77,22},
            {34,13},
            {23,11,16}};
        int target=16;
        int[] ans=search(arr,target,0,4);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target,int start,int end){
        for (int i = start; i< end && i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                
            }
        }
        return new int[]{-1,-1};
    }
    

}

