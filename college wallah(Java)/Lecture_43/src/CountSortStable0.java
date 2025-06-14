public class CountSortStable0 {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int j : arr) if (j > max) max = j;
        return max;
    }
    static void countSort(int[] arr){
        int size = arr.length;
        int[] ans = new int[size];
        int max = findMax(arr);
        int[] freq = new int[max+1];
        // frequency
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        // count frequency
        for(int i=1;i< freq.length;i++){
            freq[i] += freq[i-1];
        }
        // ans
        for(int i=size-1;i>=0;i--){
            int idx = freq[arr[i]] - 1;
            ans[idx] = arr[i];
            freq[arr[i]]--;
        }
        System.arraycopy(ans, 0, arr, 0, size);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,2,1,2,3,4,5,1,2,1,3,2,5,6,4,2,4,1};
        countSort(arr);
        printArray(arr);
    }
}
