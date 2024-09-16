public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr, target));
        
    }
    static int search(int[] arr,int target){
        int peak=PeakIndex(arr); //4
        int FirstTry=Bs(arr, target, 0, /*4*/peak );
        if(FirstTry!=-1){
            return FirstTry;
        }
        return Bs(arr, target, peak+1, arr.length-1);
    }
    static int PeakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if (arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        
        }
        return start;  //4
    }
    static int Bs(int[] arr,int target,int start,int end){
        boolean isBs= arr[start]<arr[end]; //1 < 5
        while(start<=end){ //0 <= 4 // 0 <= 2 // 2 <= 2
            int mid=start+(end-start)/2; //3 //1 //2
            if(arr[mid]==target){ //3 == 3;
                return mid; // ANS : 2
            }
            if(isBs){
                if(target<arr[mid]){ //3 < 4  // 3 < 2
                    end=mid-1;  // 2
                }
                else{
                    start=mid+1;// 2
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
          
        }
        return -1;
    }
    
}
