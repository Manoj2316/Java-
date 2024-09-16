import java.util.ArrayList;
import java.util.List;

public class LsString {
    public static void main(String[] args) {
        String str = "Manoj Kiyan M";
        char target = 'n';
        List<Integer> indices = lsstring(str, target, 0, 12);
        if (!indices.isEmpty()) {
            System.out.print("The letter " + target + " is placed on index ");
            for (int i = 0; i < indices.size(); i++) {
                if (i > 0) {
                    System.out.print(" and ");
                }
                System.out.print(indices.get(i));
            }
            System.out.println();
        } else {
            System.out.println("The letter " + target + " is not found in the specified range.");
        }
    }

    static List<Integer> lsstring(String str, char target, int start, int end) {
        List<Integer> indices = new ArrayList<>();
        if (str.length() == 0) {
            return indices;
        }
        for (int i = start; i < end && i < str.length(); i++) {
            if (str.charAt(i) == target) {
                indices.add(i);
                System.out.println("Found " + target + " at index " + i); // Debugging print
            }
        }
        return indices;
    }
}
