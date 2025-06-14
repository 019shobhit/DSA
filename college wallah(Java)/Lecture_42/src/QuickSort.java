import java.awt.*;
import java.util.Scanner;

public class QuickSort {
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr,int start,int end){
        int pivot = arr[start];
        int count=0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<pivot) count++;
        }
        int pivot_idx = start+count;
        swap(arr,start,pivot_idx);
        int i =start,j=end;
        while(i<pivot_idx && j>pivot_idx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivot_idx &&j>pivot_idx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_idx;
    }
    static void quickSort(int[] arr,int start, int end){
        if(start>=end) return;
        int pi = partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,9,1,7,8};
        System.out.println("Array before sorted");
        printArray(arr);

        System.out.println("Array After sort");
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
}
