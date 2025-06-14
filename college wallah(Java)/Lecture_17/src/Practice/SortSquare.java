package Practice;

public class SortSquare {
    public static void main(String[] args) {
        int[] arr = {-10,-8,-5,-1,0,1,3,4,5,8,12};
        int n = arr.length;
        int[] ans = new int[n];
        int i=0,j=n-1;
        int k=0;
        while(i<=j){
            if(Math.abs(arr[i]) >=Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[k++] = arr[j]*arr[j];
                j--;
            }
        }
        i=0;
        j=n-1;
            while(i<j && ans[i]>ans[j]){
                int temp = ans[i];
                ans[i]=ans[j];
                ans[j]=temp;
                i++;
                j--;
            }
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
