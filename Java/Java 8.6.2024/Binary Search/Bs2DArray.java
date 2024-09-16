import java.util.Arrays;

public class Bs2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target=6;
        int[] ans=search(arr, target, 0, 3);
       System.out.println(Arrays.toString(ans));
        
    }
    static int[] search(int[][] arr,int target,int start,int end){
        for (int i = start; i<end && i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                
            }
            
        }
        return new int[]{-1,-1};
    }
    
}
