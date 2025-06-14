package Practice;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int i=0;
        int j =n-1;
        while(i<j){
            while(arr[i] %2==1 && i<j){
                i++;
            }
            while(arr[j]%2==0 && i<j){
                j--;
            }
            if(arr[i] %2==0 && arr[j]%2==1){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        for(int c : arr){
            System.out.print(c+" ");
        }
    }
}
