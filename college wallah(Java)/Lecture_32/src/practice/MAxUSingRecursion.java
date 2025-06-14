package practice;


public class MAxUSingRecursion {
    public static int max(int[] arr,int idx){
        if(idx==arr.length-1)return  arr[idx];
        return Math.max(arr[idx],max(arr,idx+1));
    }
    public static int sum(int[] arr,int idx){
        if(idx==arr.length) return 0;
        return arr[idx]+sum(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,3,7,6,2,4,8,6,5};
        System.out.println(max(arr,0));
        System.out.println(sum(arr,0));
    }
}
