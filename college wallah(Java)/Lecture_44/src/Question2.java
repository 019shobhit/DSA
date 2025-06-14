//Given an array of positive and negative integers,segrigate in linear time and constant space. the output should print all negative number, followed by all positive numbers.

public class Question2 extends Question1 {

    static void sortArray1(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r){
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-13,20,7,0,-4,-13,11,-5,13};
        sortArray1(arr);
        printArray(arr);
    }
}
