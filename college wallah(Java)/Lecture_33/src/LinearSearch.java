import java.util.Scanner;

public class LinearSearch {

    static boolean search(int[] arr, int n , int x){
        if(arr.length<=n) return false;
        if(arr[n]==x) return  true ;
        return  search(arr,n+1,x);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Element to be searched: ");
        int x =sc.nextInt();

        if(search(arr,0,x)){
            System.out.println("Yes element is present in the array");
        }
        else
            System.out.println("No Element is not present in the array");
    }
}
