import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] shallowCopy = arr; // Shallow copy
//        shallowCopy[0] = 99; // Modify the copy
//        System.out.println(arr[0]); // Output: 99, original array is affected
        int[] deepCopy = Arrays.copyOf(arr,arr.length);
        deepCopy[0] = 99; // Modify the copy
        System.out.println(arr[0]); // Output: 1, original array is not affected
    }
}
