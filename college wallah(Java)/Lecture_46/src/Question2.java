// Given the rotated sorted array of integers, which contains distinct elements, and an integer target, return the index of target if it is in the array. Otherwise return -1.

public class Question2 {

    static  int findidx(int[] arr, int x){
        int n = arr.length;
        int start =0,end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]== x) return  mid;
            else if(arr[mid]< arr[end]){
                if(x>arr[mid] && x<=arr[end]){
                    start= mid+1;
                }
                else end = mid -1;
            }
            else {
                if(x>=arr[start] && x<arr[mid]){
                    end = mid -1;
                }
                else start= mid +1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int target = 2;
        System.out.println(findidx(arr,target));
    }
}
