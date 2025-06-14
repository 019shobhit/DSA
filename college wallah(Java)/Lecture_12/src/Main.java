import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        float n = 45.49f;
//        double x = Math.sqrt(10);
//        System.out.println(Math.sqrt(10));
//        System.out.println(Math.round(n));
        int[] arr= {1,2,3};
//        clone
//        copyOf
//        copyOfRange

        int[] arr2 = Arrays.copyOf(arr,arr.length);
        arr2[0] = 0;
        for(int i : arr){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for(int i : arr2){
            System.out.printf("%d ",i);
        }
//        for(int[] j : arr) {
//            for (int i : j) {
//                System.out.println(i);
//            }
//        }
    }
}