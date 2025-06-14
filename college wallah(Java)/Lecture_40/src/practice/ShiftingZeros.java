package practice;

public class ShiftingZeros {
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] ==0 && arr[j+1]!=0){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,41};
        print(arr);
        sort(arr);
        print(arr);
    }
}
