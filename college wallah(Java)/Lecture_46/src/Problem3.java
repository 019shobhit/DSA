//Search element in rotated sorted array with duplicate elements. Return true if element is found, else return false.

public class Problem3 {

    static boolean search(int[] arr, int x){
        int n = arr.length;
        int start =0, end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== x) return  true;
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(x>arr[mid] && x<arr[end]) start = mid +1;
                else end = mid -1;
            }
            else {
                if(x>arr[start] && x< arr[end]) end = mid -1;
                else start =mid +1;
            }

        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,2,2,3,4,4,1,1};
        int target = 2;
        System.out.println(search(arr,target));
    }
}
