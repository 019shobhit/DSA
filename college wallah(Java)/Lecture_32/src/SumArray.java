import java.util.Scanner;

public class SumArray {

    static int sum(int[] arr,int n){
        if(arr.length-1 == n) return arr[n];
        return arr[n]+sum(arr,n+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of the array is: "+sum(arr, 0));
    }
}
