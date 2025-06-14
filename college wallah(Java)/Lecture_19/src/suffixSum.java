import java.util.Scanner;

public class suffixSum {
    static void suffixSumArray(int[] arr){
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
    }
    static  void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        }suffixSumArray(arr);
        printArray(arr);

    }
}
