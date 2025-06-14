package practice;

public class CountSort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int findMax(int[] arr){
        int mx= arr[0];
        for(int i : arr){
            if(mx<i) mx=i;
        }
        return mx;
    }
    public static void countSort(int[] arr){
        int[] ans = new int[arr.length];
        int max = findMax(arr);
        int[] ps = new int[max+1];
        for(int i : arr){
            ps[i]++;
        }
        int sum=0;
        for(int i=1;i<ps.length;i++){
            ps[i]+=ps[i-1];
        }
        //
        for(int i=arr.length-1;i>=0;i--){
            int idx = ps[arr[i]]--;
            ans[idx-1]= arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,3,2,3,1,4,4,2};
        print(arr);
        countSort(arr);
        print(arr);

    }
}
