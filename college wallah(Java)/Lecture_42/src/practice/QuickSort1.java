package practice;

public class QuickSort1 {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int pivot(int[] arr,int l, int r){
        int pi = arr[l];
        int count=0;
        for(int i=l+1;i<=r;i++){
            if(arr[i] <= pi) count++;
        }
        int idx = count+l;
        swap(arr,idx,l);
        int i=l;
        int j=r;
//        System.out.println("pass");
        while(i<idx && j>idx){
            while(arr[i] <= pi)i++;
            while(arr[j] > pi) j--;
            if(i<idx && j>idx){
                swap(arr,i,j);
            }
        }
        return idx;
    }
    public static void sort(int[] arr,int l,int r){
        if(l>=r) return;
        int pi = pivot(arr,l,r);
        sort(arr,l,pi-1);
        sort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,90,73,5,74,20};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
