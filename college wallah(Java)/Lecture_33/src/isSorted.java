import java.util.ArrayList;
import java.util.Scanner;

public class isSorted {

    static boolean issorted(int[] arr, int n){
        if(n>=arr.length-1) return true;
        if(arr[n]<arr[n+1]) return issorted(arr,n+1);
        else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(issorted(arr,0)){
            System.out.println("Yes the array you entered is sorted");
        }
        else{
            System.out.println("Not as sorted array");
        }
    }
}
