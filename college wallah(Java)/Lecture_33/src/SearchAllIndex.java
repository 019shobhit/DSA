import java.util.Scanner;

public class SearchAllIndex {
    static void search(int[] arr, int n,int x){
        if(arr.length<=n) return;
        if(arr[n]==x){
            System.out.println(n+1);
        }
        search(arr,n+1,x);
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
        search(arr,0,x);
    }
}
