// Given an array of size N containing only 0s,1s and 2s; sort the array in ascending order.

public class Question3Approach2 extends Question1{
    static void sort2(int[] arr){
        int c0=0,c1=0,c2=0;
        for(int i: arr){
            if(i == 0) c0++;
            else if(i == 1) c1++;
            else c2++;
        }
        int k =0;
        while(c0>0){
            arr[k++] = 0;
            c0--;
        }
        while(c1>0){
            arr[k++] = 1;
            c1--;
        }
        while(c2>0){
            arr[k++] = 2;
            c2--;
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,0,2,0,1,1,0,2,1,0,2};
        sort2(arr);
        printArray(arr);
    }
}
