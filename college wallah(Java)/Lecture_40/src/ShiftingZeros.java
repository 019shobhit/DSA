public class ShiftingZeros {
    public static void main(String[] args) {
        int[] arr ={0,0,5,0,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
