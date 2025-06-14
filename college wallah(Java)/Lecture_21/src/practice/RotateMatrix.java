package practice;

public class RotateMatrix extends TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
        transposeinPlace(arr);
        for(int[] i : arr){
            reverse(i);
        }
        print(arr);


    }
    public static void reverse(int[] arr){
        int i =0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
