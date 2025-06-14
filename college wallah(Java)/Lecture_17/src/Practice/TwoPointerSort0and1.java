package Practice;

public class TwoPointerSort0and1 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,0,1,0,1,0};
        int n = arr.length;
        int i=0;
        int j = n-1;
        while(i<j){
            while(arr[i]==0 && i<j){
                i++;
            }
            while(arr[j]==1 && i <j){
                j--;
            }
            if(arr[i] ==1 && arr[j]==0){
                arr[i++] =0;
                arr[j--]=1;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
