// Given an array of size N containing only 0s, 1s and 2s; sort the array in ascending order.

public class Question3Approach3 extends Question1{
    static void swap(int[] arr,int x, int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
    static void sort(int[] arr){
        int lo=0,mid =0,hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==1) mid++;
            else if(arr[mid]==0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            }
            else{
                swap(arr,hi,mid);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,0,2,0,1,1,0,2,1,0,2};
        sort(arr);
        printArray(arr);

    }
}
