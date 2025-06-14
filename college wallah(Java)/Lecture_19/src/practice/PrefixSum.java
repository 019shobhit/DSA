package practice;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,7,4};

        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
