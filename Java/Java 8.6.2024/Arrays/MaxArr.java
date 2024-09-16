import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr={10,65,47,89,90};
        System.out.println(max(arr));
        }
        static int max(int[]arr){
            int maxVal=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>maxVal){
                    maxVal=arr[i];
                }
                
            }
            return maxVal;    
        }
    }

