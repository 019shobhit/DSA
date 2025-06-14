package practice;
public  class QuickSort {
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int pivot(int[] arr, int st, int end){
        int pi = arr[st];
        int count =0;
        for(int i=st+1;i<=end;i++){
            if(arr[i] <= pi) count++;
        }
        int idx = st+count;
        swap(arr,st,idx);
        int i=st;
        int j=end;
        while(i<idx && j>idx){
            while(arr[i] <= pi) i++;
            while(arr[j] > pi) j--;
            if(i < idx && j > idx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return idx;
    }
    public static void sort(int[]arr, int st, int end){
        if(st >= end) return;
        int pi = pivot(arr,st,end);
        sort(arr,st,pi-1);
        sort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,2,5,3,6,9,0};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
}