package practice;

public class Subsets {
    public static void print(int[] arr, int idx, int sum){
        if(idx==arr.length){
            System.out.println(sum);
            return;
        }
        int x = arr[idx];
        print(arr,idx+1,sum+x);
        print(arr,idx+1,sum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        print(arr,0,0);
    }
}
