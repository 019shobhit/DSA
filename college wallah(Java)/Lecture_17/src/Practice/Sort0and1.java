package Practice;

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,0,1,0,1,0};
        int n = arr.length;
        int zero =0;
        for(int i : arr){
            if(i==0) zero++;
        }
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }else{
                arr[i] =1;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
