package practice;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,7,4};
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        int n = arr[arr.length-1]/2;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
