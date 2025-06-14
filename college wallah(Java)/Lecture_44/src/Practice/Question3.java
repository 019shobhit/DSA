package Practice;

import static Practice.Question2.print;

public class Question3 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,2,0,0,1,2,2,0,0,1,0,2,2,0,1};
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(mid <= r){
            if(arr[mid]==1) mid++;
            if(arr[mid]==2){
                swap(arr,mid,r);
                r--;
            }
            if(arr[mid]==0){
                swap(arr,mid,l);
                l++;
                mid++;
            }
        }
        print(arr);
    }
}
