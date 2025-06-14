import java.util.ArrayList;
import java.util.Scanner;

public class searchAllidxArrayList {

    static ArrayList<Integer> findallidx(int[] arr,int n , int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if(n>=arr.length) return  ans;
        if(arr[n]== x){
            ans.add(n);
        }
        ArrayList<Integer> newans = findallidx(arr,n+1,x);
        ans.addAll(newans);
        return  ans;
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
        ArrayList<Integer> ans =  findallidx(arr, 0, x);

        for(Integer i : ans){
            System.out.println(i+" ");
        }
    }
}
