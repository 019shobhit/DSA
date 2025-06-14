import java.util.Scanner;

public class searchAllIdx {

    static void  findallidx(int[] arr, int n,int x){
        if(n >= arr.length) return;
        if(arr[n]==x){
            System.out.println(n+" ");
        }
        findallidx(arr,n+1,x);

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
        System.out.print("Enter target to be searched: ");
        int x = sc.nextInt();
        findallidx(arr, 0, x);
    }
}
