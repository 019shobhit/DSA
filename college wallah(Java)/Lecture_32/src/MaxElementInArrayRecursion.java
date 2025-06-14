import java.util.Scanner;

public class MaxElementInArrayRecursion {

    static  int maxElement(int[] arr, int n){
        if(n==arr.length-1) return  arr[n];
        return Math.max(arr[n],maxElement(arr,n+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The max Element is: "+ maxElement(arr,0));
    }
}
