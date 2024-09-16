import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class InfinateArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170,222,897,909,1000};
        int target=160;
        System.out.println(FindIndex(arr,target));
        
    }
    /* Avoid out of bounce using this code:
    
     static int FindIndex(int[] arr, int target) {
    int start = 0;
    int end = 1;
    // Increase the range exponentially until the target is within the range
    while (true) {
        try {
            if (target <= arr[end]) {
                break;
            }
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        } catch (ArrayIndexOutOfBoundsException e) {
            end = arr.length - 1;
            break;
        }
    }
    return Bs(arr, target, start, end);
}

     */

    static int FindIndex(int[] arr,int target){
        int start=0;
        int end=1;
        while (/*end<arr.length &&*/ target>arr[end]) {
            int NewStart=end+1;
            end=end+(end-start+1)*2;
            start=NewStart;
        }
       /* if(end>=arr.length){
            end=arr.length-1;
        }*/ 
        return Bs(arr,target,start,end);
    }
    static int Bs(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
             if(target > arr[mid]){
                start=mid + 1;
            }else if (target<arr[mid]) {
                end=mid - 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
