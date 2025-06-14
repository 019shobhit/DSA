import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    static void prefixSumArray(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        prefixSumArray(arr);
        printArray(arr);
    }
}
