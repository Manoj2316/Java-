import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MaxRangeArr {
    public static void main(String[] args) {
        int[] arr={32,66,413,646,223};
        System.out.println(maxRange(arr,1,4));
    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
       return maxVal;
    }
    
}
