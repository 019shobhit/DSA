public class RadixSort {
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static void countSort(int[] arr,int place){
        int n= arr.length;
        int[] ans = new int[n];
        int max = findMax(arr);
        int[] freq = new int[10];
        for(int i=0;i<n;i++){
            freq[(arr[i]/place)%10]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        for(int i=n-1; i>=0;i--){
            int idx = freq[(arr[i]/place)%10]-1;
            ans[idx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        System.arraycopy(ans, 0, arr, 0, n);
    }
    static void redixSort(int[] arr){
        int max = findMax(arr);
        // apply counting sort on sort elements based on place value
        for(int place=1; max/place>0;place+=10){
            countSort(arr,place);
        }
    }


    public static void main(String[] args) {
        int[] arr= {145,23,56,158,999,45,1,02,456};
        redixSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
