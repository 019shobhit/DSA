package Practice;

public class Question2 {
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {19,-20,7,-4,-13,11,-5,3};
        print(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(i<j && arr[i] <0)i++;
            while(i<j &&arr[j] >0) j--;
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
            print(arr);
    }
}
