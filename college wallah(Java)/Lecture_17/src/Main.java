public class Main{
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int[] arr ,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n= arr.length;
        int r = 3;
        r = r % n;
//        int k=0;
//        int[] rotate = new int[n];
//        for(int i=n-r;i<n;i++){
//            rotate[k++] = arr[i];
//        }
//        for(int i=0;i<n-r;i++){
//            rotate[k++] = arr[i];
//        }
        rev(arr,0,n-r-1);
        rev(arr,n-r,n-1);
        rev(arr,0,n-1);
        print(arr);

    }
}