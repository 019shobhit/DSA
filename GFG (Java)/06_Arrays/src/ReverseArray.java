public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,6,99,56,34,67,23,99};
        int i=2;
        int j=i+3;
        while(i<j){
            int temp = arr[i];
            arr[i++]= arr[j];
            arr[j--] = temp;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
