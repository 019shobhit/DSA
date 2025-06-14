import java.util.Scanner;

public class searchLastidx {

    static int lastidx(int[] arr,int n,int x){
        if(n<0) return  -1;
        if(arr[n]==x) return n;
        return lastidx(arr,n-1,x);
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

        int z = lastidx(arr,n-1,x);
        if (z >= 0) {
            System.out.println("yes target is present in the array at: " + z);
        } else {
            System.out.println("No target is not present in the array");
        }
    }
}
