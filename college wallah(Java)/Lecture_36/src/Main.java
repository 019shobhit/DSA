import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            result.append(minimumOperations(a)).append("\n");
        }
        System.out.println(result);
    }

    private static int minimumOperations(int[] a) {
        Set<Integer> elements = new HashSet<>();
        boolean containsZero = false;

        for (int num : a) {
            elements.add(num);
            if (num == 0) {
                containsZero = true;
            }
        }
        int mex = 0;
        while (elements.contains(mex)) {
            mex++;
        }
        if (!containsZero) {
            return 2; // At least two operations needed if no zero is present
        } else if (mex > 1) {
            return 1; // One operation if 0 is present but MEX > 1
        } else {
            return 0; // Array already contains only zeros
        }
    }
}
