public class BinarysearchRecursively {

    static boolean binarySearch(int[] arr, int start, int end, int target){
        if(start>end) return  false;
        int mid = (start + end)/2;
        if(arr[mid]== target) return  true;
        else if(arr[mid]>target)return  binarySearch(arr,start,mid-1,target);
        else return binarySearch(arr,mid+1,end,target);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 16;
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
}
