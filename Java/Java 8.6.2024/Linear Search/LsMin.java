public class LsMin {
    public static void main(String[] args) {
        int[] arr={143,53,54,34,77,44,90};
        int minVal=arr[0];
        minVal=LsMinimum(arr,minVal,0,6);
        System.out.println("Minumum Value is "+minVal);
    }    
    static int LsMinimum(int[] arr,int minVal,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i<end && i < arr.length; i++) { 
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }

}
