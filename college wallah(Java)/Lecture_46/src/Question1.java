// A rotated sorted array is a sorted array on which rotation operation has been performed some number of times. Given a rotated sorted array, find the index of the minimum element in the array. Follow 0 based indexing.


public class Question1 {
    static int findMin(int[] arr){
        int n = arr.length;
        int start = 0, end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[n-1]){
                start = mid +1;
            }
            else {
                ans = mid;
                end = mid -1;

            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(findMin(arr));

    }
}
