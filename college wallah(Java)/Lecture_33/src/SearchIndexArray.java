import java.util.Scanner;

public class SearchIndexArray {

    static int search(int[] arr, int n,int x){
        if(n>=arr.length) return -1;
        if(arr[n]==x) return n;
        return search(arr,n+1,x);
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
        int ans = search(arr,0,x);
        if(ans==-1){
            System.out.println("No Element is not present in the array");
        }
        else
            System.out.println("Yes element is present in the array at index: "+(ans+1));
    }
}
