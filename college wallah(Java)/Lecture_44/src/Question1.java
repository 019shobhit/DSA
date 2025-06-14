//Given an array where all its elements are sorted in its order except two swapped elements, sort it in linear time. Assume there are no duplicate in the array.

public class Question1 {

    static void sortArray(int[] arr){
        int n = arr.length;
        int x = -1;
        int y = -1;
        if(n<=1) return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(x==-1) {
                    x = i;
                    y = i + 1;
                }
                else y=i;
            }
        }
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y] = temp;
    }
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,7,8,9};
        sortArray(arr);
        printArray(arr);
    }
}
//class PrintArray{
//
//}
