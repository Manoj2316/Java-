public class FirstAndLastElement2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        // Call the SearchIndex function
        int[] result = SearchIndex(arr, target);

        // Print the result
        System.out.println("First and Last Index of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }

    static int[] SearchIndex(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = Search(arr, target, true);
        int end = Search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int Search(int[] arr, int target, boolean FirstLastIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (FirstLastIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
