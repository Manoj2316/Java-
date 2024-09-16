public class splitArray {
    public static void main(String[] args) {
        int[]arr={7,2,5,10,8};
        int m=2;
        System.out.println(ArraySplit(arr, m));
    }
    static int ArraySplit(int[]arr,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start, arr[i]);
            end+=arr[i];
        }
        while (start<end) {
            int mid=start+(end-start)/2;                    
            int sum=0;            
            int pieces=1;
            for (int num : arr) {
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
            
        }
        return end;
    }
    
}
/*
1. **Initialization**:
   - `start = 10` (max value in the array)
   - `end = 32` (sum of all elements)

Sure, let's walk through the code using your example array `{7, 2, 5, 10, 8}` and `m = 2`.

### Initial Setup
- **Array**: `{7, 2, 5, 10, 8}`
- **m**: `2`
- **start**: `10` (maximum value in the array)
- **end**: `32` (sum of all elements in the array)

### Binary Search Process
1. **First Iteration**:
   - **mid**: `(10 + 32) / 2 = 21`
   - **Splitting the Array**:
     - Start with `sum = 0` and `pieces = 1`.
     - Add `7` to `sum`: `sum = 7`
     - Add `2` to `sum`: `sum = 9`
     - Add `5` to `sum`: `sum = 14`
     - Add `10` to `sum`: `sum = 24` (exceeds `mid`, so start a new subarray)
       - `pieces = 2`, `sum = 10`
     - Add `8` to `sum`: `sum = 18`
   - **Result**: `pieces = 2` (equal to `m`)
   - **Update**: `end = mid = 21`

2. **Second Iteration**:
   - **mid**: `(10 + 21) / 2 = 15`
   - **Splitting the Array**:
     - Start with `sum = 0` and `pieces = 1`.
     - Add `7` to `sum`: `sum = 7`
     - Add `2` to `sum`: `sum = 9`
     - Add `5` to `sum`: `sum = 14`
     - Add `10` to `sum`: `sum = 24` (exceeds `mid`, so start a new subarray)
       - `pieces = 2`, `sum = 10`
     - Add `8` to `sum`: `sum = 18` (exceeds `mid`, so start a new subarray)
       - `pieces = 3`, `sum = 8`
   - **Result**: `pieces = 3` (greater than `m`)
   - **Update**: `start = mid + 1 = 16`

3. **Third Iteration**:
   - **mid**: `(16 + 21) / 2 = 18`
   - **Splitting the Array**:
     - Start with `sum = 0` and `pieces = 1`.
     - Add `7` to `sum`: `sum = 7`
     - Add `2` to `sum`: `sum = 9`
     - Add `5` to `sum`: `sum = 14`
     - Add `10` to `sum`: `sum = 24` (exceeds `mid`, so start a new subarray)
       - `pieces = 2`, `sum = 10`
     - Add `8` to `sum`: `sum = 18`
   - **Result**: `pieces = 2` (equal to `m`)
   - **Update**: `end = mid = 18`

4. **Fourth Iteration**:
   - **mid**: `(16 + 18) / 2 = 17`
   - **Splitting the Array**:
     - Start with `sum = 0` and `pieces = 1`.
     - Add `7` to `sum`: `sum = 7`
     - Add `2` to `sum`: `sum = 9`
     - Add `5` to `sum`: `sum = 14`
     - Add `10` to `sum`: `sum = 24` (exceeds `mid`, so start a new subarray)
       - `pieces = 2`, `sum = 10`
     - Add `8` to `sum`: `sum = 18` (exceeds `mid`, so start a new subarray)
       - `pieces = 3`, `sum = 8`
   - **Result**: `pieces = 3` (greater than `m`)
   - **Update**: `start = mid + 1 = 18`

### Conclusion
- The binary search loop ends when `start` equals `end`.
- The minimum possible largest sum for splitting the array into `2` subarrays is `18`.

### Final Split
- One possible split of the array `{7, 2, 5, 10, 8}` into `2` subarrays with the largest sum minimized is `{7, 2, 5}` and `{10, 8}`.
- The largest sum among these subarrays is `18`.

I hope this detailed example helps you understand how the code works! If you have any more questions, feel free to ask.*/