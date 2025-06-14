public class CountSortStable {
    static int findMaxElement(int[] arr){
        int max = arr[0];
        for(int i: arr) if (i>max) max = i;
        return max;
    }
    static void countSort(int[] arr){
        int size = arr.length;
        int[] ans = new int[size];
        int max = findMaxElement(arr);
        int[] freq = new int[max+1];
        // create frequency
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        // creating count frequency
        for(int i=1;i< freq.length;i++){
            freq[i] += freq[i-1];
        }

        // ans
        for(int i=size-1;i>=0;i--){
            int idx = freq[arr[i]] - 1;
            ans[idx] = arr[i];
            freq[arr[i]]--;
        }
        for(int i=0;i<size;i++){
            arr[i] = ans[i];
        }
    }

    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,2,1,2,3,4,5,1,2,1,3,2,5,6,4,2,4,1};
        countSort(arr);
        printArray(arr);
    }
}
