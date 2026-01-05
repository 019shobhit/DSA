public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {23,45,78,99,23,55,15};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
}