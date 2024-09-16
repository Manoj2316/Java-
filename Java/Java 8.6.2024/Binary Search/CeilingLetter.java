import java.util.Arrays;

public class CeilingLetter {
    public static void main(String[] args) {
        String[] arr = {"c","d","f","j"};
        String target = "j";
        String ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static String ceiling(String[] arr, String target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target.compareTo(arr[mid]) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
